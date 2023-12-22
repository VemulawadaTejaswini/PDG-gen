import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans;

        if(a>b){
            int c = a-1;
                if(c>=b){
                    ans = a+a-1;
                    System.out.println(ans);
                }else{
                    ans = a+b;
                    System.out.println(ans);
                }
        }else if (a==b){
            ans = a+b;
            System.out.println(ans);
        }else if (a<b){
            int c = b-1;
                if(c>=a){
                    ans = b+b-1;
                    System.out.println(ans);
                }else if(c<a){
                    ans = a+b;
                    System.out.println(ans);
                }

        }
    }
}