import java.util.Scanner;
class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int A = sc.nextInt();
        int B = sc.nextInt();
        double H = 5*sc.nextDouble();
        double M = sc.nextDouble();
        H = H+M/12;
      	double RAD =Math.toRadians((M-H)*6);
        double COS = Math.cos(RAD);
        double ans = (A*A)+(B*B)-(2*A*B*COS);
        ans = Math.sqrt(ans);
      	System.out.println(ans);
    }
}