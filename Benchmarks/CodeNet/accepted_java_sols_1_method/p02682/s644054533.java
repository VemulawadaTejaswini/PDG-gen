import java.util.*;

public class Main {
    public static void main(String[] args){

        int count=0;

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int k=sc.nextInt();

        if(k<=a){
            count+=k;
            k=0;
        }else{
            count+=a;
            k-=a;
        }
        if(k<=b){
            k=0;
        }
        else{
            k-=b;
        }
        count-=k;
        System.out.println(count);
    }
}
