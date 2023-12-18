import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int ave; int sum=0;
            int max=0; int min=5000;
            int n=sc.nextInt();
            if(n==0) break;
            int[] count = new int[n];
            for(int i=0;i<count.length;i++){
                count[i]=sc.nextInt();
                if(count[i]>max) max=count[i];
                if(count[i]<min) min=count[i];
                sum+=count[i];
            }
            sum-=max; sum-=min;
            ave=sum/(n-2);
            System.out.printf("\n%d",ave);
        }

    }
}
