import java.util.Scanner;

class Main{
    static Scanner scan=new Scanner(System.in);
    public static void main(String args[]){
        int n;
        double t,a;

        n=scan.nextInt();
        t=scan.nextDouble();
        a=scan.nextDouble();
        double h[]=new double[n];
        for(int i=0;i<n;i++){
            h[i]=scan.nextDouble();
        }
        double min=99999999.0;
        double x;
        int ans=0;
        for(int i=0;i<n;i++){
            x=t-h[i]*0.006;
            if(Math.abs(x-a)<min){
                min=Math.abs(x-a);
                ans=i+1;
            }
        }
        System.out.println(ans);

    }   
}