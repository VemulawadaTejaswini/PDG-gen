import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int i;
        double data[] = new double[1000];
        double sum=0,ave,z=0,x;

        while(true){
            int n = sc.nextInt();

            if(n==0)break;

            for(i=0;i<n;i++){
                data[i]=sc.nextInt();
                sum=sum+data[i];
            }

            ave=sum/(double)n;

            for(i=0;i<n;i++){
                z=z+(data[i]-ave)*(data[i]-ave);
            }

            x=z/(double)n;

            System.out.printf("%f\n",Math.sqrt(x));

            sum=0;
            z=0;

        }
    }
}
