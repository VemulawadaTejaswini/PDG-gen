import java.util.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int A = sc.nextInt();
        int B = sc.nextInt();
        double H = sc.nextDouble();
        double M = sc.nextDouble();
      	double RAD =Math.abs((M/30)-(H/6))*Math.PI;
        double COS = Math.cos(RAD);
        double ans = A*A+B*B-(2*A*B*COS);
        ans = Math.sqrt(ans);
        System.out.println(ans);
    }
}