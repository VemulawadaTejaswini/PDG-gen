import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int j=0;
        int[] ave=new int[20];
        Scanner sc = new Scanner(System.in);
        while(true){
            int sum=0;
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
            ave[j]=sum/(n-2);
            j++;
        }
        for(int i=0;i<j;i++){
            System.out.println(ave[i]);
        }

    }
}
