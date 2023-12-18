import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double x[] = new double[4];
        double y[] = new double[4];
      for(;n>0;n--){
            for(int i=0; i<4; i++){
                x[i] = sc.nextDouble();
                y[i] = sc.nextDouble();
            }
            double ans=Math.abs((x[1]-x[0])*(y[3]-y[2])-(y[1]-y[0])*(x[3]-x[2]));
            System.out.println(ans<=1e-10 ? "YES" : "NO");
        }
    }
}