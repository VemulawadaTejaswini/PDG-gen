import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        while(true){
            int i,j;
            int n=sc.nextInt();
            if(n==0 ){
                break;
            }
            int[] num=new int[n];
            int max=0,min=0;
            int sum=0;

            for(i=0;i<n;i++){
                num[i]=sc.nextInt();
                sum+=num[i];
                if(num[max]<num[i]){
                    max=i;
                }
                if(num[min]>num[i]){
                    min=i;
                }
            }

            sum=sum-num[max]-num[min];

            System.out.println(sum/(n-2));
        }
        sc.close();
    }
}
