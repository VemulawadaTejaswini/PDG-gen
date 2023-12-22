import java.util.*;
public class Main{
    public static void main(String[] args) {
        int test;
        Scanner sc=new Scanner(System.in);
        //test=sc.nextInt();
     //   while(test-->0){
            int k;
            int a,b;
            k= sc.nextInt();
            a=sc.nextInt();
            b=sc.nextInt();
            if(a%k==0|| b%k==0){
                System.out.println("OK");
            }
            else {
                if((a/k)<(b/k)){
                    System.out.println("OK");
                }
                else{
                    System.out.println("NG");
                }
            }

       // }
    }
}