import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        for(;;){
            int n=scan.nextInt();
            if(n==0){
                break;
            }
            int S=0;
            int s[]=new int[n];
            for(int i=0;i<n;i++){
                s[i]=scan.nextInt();
                S+=s[i];
            }
            double m=(double)S/n;
            double a=0;
            for(int j=0;j<n;j++){
                a+=(s[j]-m)*(s[j]-m)/n;
            }
            a=Math.sqrt(a);
            System.out.printf("%f\n",a);
        }
    }
}

