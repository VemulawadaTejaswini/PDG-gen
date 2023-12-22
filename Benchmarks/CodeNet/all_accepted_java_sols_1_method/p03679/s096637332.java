import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        String ans;
        if(A>=B) ans = "delicious";
        else if(B-A<=X) ans = "safe";
        else ans = "dangerous";
        System.out.println(ans);
    }
}
 