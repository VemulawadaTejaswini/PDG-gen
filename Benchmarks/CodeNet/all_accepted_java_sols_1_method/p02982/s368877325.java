import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int ans=0;
        double[][] x = new double[a][b];
        for(int i=0;i<a;i++){
            for(int l=0;l<b;l++){
                x[i][l]=scan.nextDouble();
            }
        }
        for(int i=0;i<a-1;i++){
            for(int p=i+1;p<a;p++){
                double e = 0;
                for(int l=0;l<b;l++){
                    e+=Math.pow(Math.abs(x[i][l]-x[p][l]),2);
                }
                if(Math.sqrt(e)%1==0)ans++;
            }
        }
        System.out.println(ans);
    }
}