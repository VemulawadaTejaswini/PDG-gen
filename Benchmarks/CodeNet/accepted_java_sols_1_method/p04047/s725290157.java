
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int n=scan.nextInt();
        int []l=new int [2*n];

        for(int i=0;i<2*n;i++){
            l[i]=scan.nextInt();
        }
        Arrays.sort(l);
        int sum=0;
        for(int i=0;i<n;i++){
             if(l[2*i]>l[2*i+1])
                 sum+=l[2+i+1];
            else
                 sum+=l[2*i];

        }
        System.out.println(sum);


    }
}