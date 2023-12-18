import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if(n==0){
                break;
            }
            int[] scores =new int[n];
            for(int i=0;i<n;i++){
                scores[i]=sc.nextInt();
            }
            Arrays.sort(scores);
            int sum=0;
            int ave=0;
            for(int j=1;j<n-1;j++){
                sum+=scores[j];
            }
            ave=sum/(n-2);
            System.out.println(ave);
        }
        sc.close();
    }
}
