import java.util.Scanner;

public class Main  {
    private static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        int n=sc.nextInt();
        double a[]=new double[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextDouble();
        }

        double s=0;
        for(int i=0;i<n;i++){
            s=s+(1/a[i]);
        }
        s=1/s;
       System.out.print(s);

    }}