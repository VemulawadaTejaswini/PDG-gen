import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,n = sc.nextInt();
        double ptx[] = new double [n];
        double pty[] = new double [n];
        double dt=0.0;
 
        for(i=0;i<n;i++){
            ptx[i] = sc.nextDouble();
        }
        for(i=0;i<n;i++){
            pty[i] = sc.nextDouble();
        }
        for(i=0;i<4;i++){
            dt = 0.0;
            if(i == 0){
                for(j=0;j<n;j++){
                    dt += Math.abs((ptx[j]-pty[j]));
                }
                System.out.printf("%.6f\n", dt);
            }
            else if(i == 1){
                for(j=0;j<n;j++){
                    dt += Math.pow(Math.abs((ptx[j]-pty[j])),2.0);
                }
                dt = Math.sqrt(dt);
                System.out.printf("%.6f\n", dt);
            }
            else if(i == 2){
                for(j=0;j<n;j++){
                    dt += Math.pow(Math.abs((ptx[j]-pty[j])),3.0);
                }
                dt = Math.cbrt(dt);
                System.out.printf("%.6f\n", dt);
            }
            else{
                for(j=0;j<n;j++){
                    if(dt < Math.abs((ptx[j]-pty[j]))){
                        dt = Math.abs((ptx[j]-pty[j]));
                    }
 
                }
                System.out.printf("%.6f\n", dt);
            }
        }
 
        sc.close();
    }
}

