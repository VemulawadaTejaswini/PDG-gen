import java.util.*;

public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=sc.nextInt();
            }
        }
        int a1,a2,a3,b1,b2,b3;
        boolean fans=false;
        for(int i=0;i<=100;i++){
            boolean ans=true;
            a1=i;
            b1=c[0][0]-i;
            b2=c[1][0]-a1;
            b3=c[2][0]-a1;
            a2=c[0][1]-b1;
            a3=c[0][2]-b1;
            if(a1<0 ||b1<0||a2<0||a3<0||b2<0||b3<0) ans=false;
            if(b2+a2!=c[1][1]) ans=false;
            if(b2+a3!=c[1][2]) ans=false;
            if(b3+a2!=c[2][1]) ans=false;
            if(b3+a3!=c[2][2]) ans=false;
            if(ans) fans=true;
        }
        if(fans)System.out.println("Yes");
        else System.out.println("No");

    }
}
