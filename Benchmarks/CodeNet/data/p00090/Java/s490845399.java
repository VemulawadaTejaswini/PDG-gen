import java.util.Scanner;
import java.util.ArrayList;
import java.awt.geom.Point2D;

public class Main
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in).useDelimiter("[\\s,]+");
        ArrayList<Double> sealX = new ArrayList<Double>();
        ArrayList<Double> sealY = new ArrayList<Double>();
        ArrayList<Integer> count = new ArrayList<Integer>();
        
        while(scan.hasNext())
        {
            int n = scan.nextInt();
            if(n==0)
                break;
            sealX.clear();
            sealY.clear();
            count.clear();
            
            //シールのデータ
            for(int i=0;i<n;i++)
            {
                sealX.add(scan.nextDouble());
                sealY.add(scan.nextDouble());
                count.add(1);
            }
            
            //何枚重なっているか
            for(int i=0;i<n;i++)
            {
                for(int j=n-1;j>i;j--)
                {
                    //2点の距離
                    double distance = Math.sqrt(Point2D.distanceSq(sealX.get(i),sealY.get(i),
                                                                   sealX.get(j),sealY.get(j)));
                    //距離が2以下ならば重なっている
                    if(distance<=2)
                    {
                        count.set(i,count.get(i)+1);
                        count.set(j,count.get(j)+1);
                    }
                     
                }
            }
            
            //重なっている枚数の最大値
            int maxCount=count.get(0);
            for(int i=1;i<n;i++)
            {
                if(maxCount<count.get(i))
                    maxCount=count.get(i);
            }
                
            System.out.println(maxCount);
        }
    }
}