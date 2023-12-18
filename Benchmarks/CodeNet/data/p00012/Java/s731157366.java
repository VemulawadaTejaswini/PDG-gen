import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            if(!sc.hasNextLine())break;
            double[][] xy=new double[3][2];
            double xp,yp;
            String[] sca = sc.nextLine().split(" ");
            int p=0;
            for(int i=0;i<3;i++){
                for(int j=0;j<2;j++){
                    xy[i][j]=Double.parseDouble(sca[p]);
                    p++;
                }
            }
            xp=Double.parseDouble(sca[4]);
            yp=Double.parseDouble(sca[5]);
            String ans="NO";
            if(solve(xy,xp,yp)){
                ans="YES";
            }
            System.out.println(ans);
        }
    }
    
    static boolean solve(double[][] xy,double xp,double yp){
        for(int i=0;i<2;i++){
            for(int j=i+1;j<3;j++){
                for(int k=0;k<3;k++){
                    if(i==k||j==k)continue;
                    if(((xy[k][1]-xy[i][1])*(xy[i][0]-xy[j][0])-(xy[k][0]-xy[i][0])*(xy[i][1]-xy[j][1]))*((yp-xy[i][1])*(xy[i][0]-xy[j][0])-(xp-xy[i][0])*(xy[i][1]-xy[j][1]))<0){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}