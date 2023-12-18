import java.util.*;

class Main{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        String ans = a + b + c;
        int X = Integer.parseInt(ans);
        if(X % 4 == 0){
            System.out.println("YES");
        }else{
        	System.out.println("NO");
        }
    }
}