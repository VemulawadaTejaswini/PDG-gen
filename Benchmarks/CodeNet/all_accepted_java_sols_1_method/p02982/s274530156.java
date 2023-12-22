import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int d=scan.nextInt();
        int x[][]=new int[n][d];
        int ans=0;
        double c;

        for(int i=0;i<n;i++) {
            for (int k = 0; k < d; k++) {
                x[i][k] = scan.nextInt();
            }
        }

        for(int i=0;i<n;i++) {
            for(int h=i+1;h<n;h++) {
//                if(i==h){continue; }
                c=0;
                for (int k = 0; k < d; k++) {
                    c+=Math.pow(x[i][k]-x[h][k],2);
//                    System.out.println(c);
                }
                c=Math.sqrt(c);
//                System.out.println(c);
                if(c%1.0==0){
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}
