import java.util.*;
import java.awt.geom.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNextLine()){
            Path2D.Double sank = new Path2D.Double();
            String[] data = sc.nextLine().split(" ");
            double[] z = new double[8];
            for(int i=0;i<8;i++){
                z[i]=Double.parseDouble(data[i]);
            }
            sank.moveTo(z[0], z[1]);
            sank.lineTo(z[2], z[3]);
            sank.lineTo(z[4], z[5]);
            
            Point2D.Double pt = new Point2D.Double(z[6], z[7]);
            String ans = "NO";
            if(sank.contains(pt)){
                ans="YES";
            }
            System.out.println(ans);
        }
    }
}