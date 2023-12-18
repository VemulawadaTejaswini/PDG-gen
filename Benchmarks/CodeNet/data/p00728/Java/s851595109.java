import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    while(true){
        int n=sc.nextInt();
        if(n==0) break;
        int i;
        int[] scores=new int[n];
        for(i=0;i<n;i++){
            scores[i]=sc.nextInt();
        }
        Arrays.sort(scores);
        int sum=0;
        int ave;
        for(i=1;i<n-1;i++){
            sum+=scores[i];
        }
        ave=sum/(n-2);
        System.out.printf("%d\n",ave);
    }
}
}
