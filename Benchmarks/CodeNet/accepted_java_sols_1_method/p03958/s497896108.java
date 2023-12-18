import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int k=scan.nextInt();
        int t=scan.nextInt();
        int[]a=new int[t];
        int max=0,sum=0;


        for(int i=0;i<t;i++){
            a[i]=scan.nextInt();
            if(a[i]>max){
                sum+=max;
                max=a[i];
            }
            else
                sum+=a[i];
        }
        if(t==1)
            System.out.println(max-1);
        else if(max>sum+1) {
            int temp=max-sum;
            if(temp<=2)
                System.out.println(1);
            else
                System.out.println(temp-1);
        }
        else
            System.out.println(0);

    }
}