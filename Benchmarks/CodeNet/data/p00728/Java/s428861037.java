import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            int max=0,min=10000,sum=0,a=0;
            int n=sc.nextInt();
            if(n==0)break;
            for(int i=0;i<n;i++){
                a=sc.nextInt();
                sum+=a;
                if(a>=max)max=a;
                if(min>=a)min=a;
            }
            sum=sum-max-min;
            System.out.println(sum/(n-2));
        }
        }
    }
