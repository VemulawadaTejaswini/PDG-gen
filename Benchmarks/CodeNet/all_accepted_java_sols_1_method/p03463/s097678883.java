import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        String ans = (B-A)%2==1?"Borys":"Alice";
        System.out.println(ans);
    }
}
