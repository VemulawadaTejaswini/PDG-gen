import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            double n = sc.nextDouble();
            double[] a=new double[11];
            a[1]=n;
            double sum=n;
            for(int i=2;i<=10;i++) {
                if(i%2==0) {
                    a[i]=a[i-1]*2;
                }else {
                    a[i]=a[i-1]/3;
                }
                sum+=a[i];
            }
            System.out.println(sum);
        }
    }
}

