import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        while(true){
            n = sc.nextInt();
            if(n==0) break;
            double sum=0;
            double sum2=0;
            double ave;
            double[] data = new double[n]; 
            for(int i=0;i<n;i++){
                data[i] = sc.nextDouble();
                sum += data[i];
                sum2 += Math.pow(data[i],2);
            }
            ave = sum/(double)n;
            double bunsan=sum2/n-Math.pow(ave,2);
            double a = Math.pow(bunsan,0.5);
            System.out.println(String.format("%.8f",a));
        }
        sc.close();
    }
}
