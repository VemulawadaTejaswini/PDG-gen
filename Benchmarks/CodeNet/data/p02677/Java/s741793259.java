import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int h = scn.nextInt();
        int m = scn.nextInt();

        double ans = 0;
        double r = Math.abs(((((h*60)+m)/2)-(m*6)));

        if(h==0&&m==0){
            System.out.println(Math.abs(a-b));
        }else if((h==0&&m==30)||(h==6&&m==0)){
            System.out.println(a+b);
        }else{
            ans = Math.sqrt((a*a)+(b*b)-(2*a*b*Math.cos(Math.toRadians(r))));
            System.out.println(ans);
        }

            scn.close();
    }
}