import java.util.*;

class Main{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        String ans;
        if(c % 3 ==0 ||a % 3 ==0 || b % 3 ==0){
            ans = "Possible";
        }else 
            ans = "Impossible";
        System.out.println(ans);
    }
}