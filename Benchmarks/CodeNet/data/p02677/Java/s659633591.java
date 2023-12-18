import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();
        double radian = angle(h,m); //radian == 0なら例外処理
        
        if(radian == 0){
            System.out.println(Math.abs(a-b));
        }
        double cos = Math.cos(radian);
        double squareDistance = Math.pow(a,2) + Math.pow(b,2) -2*a*b*cos;
        double distance = Math.sqrt(squareDistance);
        System.out.println(distance);
    }
    public static double angle(int h,int m){
        double aRad = (60*h+m)/2;
        double bRad = 6*m;
        double rad = 0;
        if(Math.abs(aRad-bRad) == 180){
            rad = 180;
        }
        else if(aRad < bRad){
            rad = bRad - aRad;
        }
        else if(aRad > bRad){
            rad = aRad - bRad;
        }
        else if(aRad == bRad){
            rad = 0;
        }
        double radian = Math.toRadians(rad);
        return radian;
    }
}