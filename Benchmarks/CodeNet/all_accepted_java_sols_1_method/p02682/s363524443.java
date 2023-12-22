import java.util.Scanner;
 
public class Main{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int k=in.nextInt();
        int sum=a,min=0;
        if((a+b)<=k){
            min=k-(a+b);
            sum=sum-min;
        }else if(a>k){
            sum=k;
        }
        System.out.println(sum);
    }
}