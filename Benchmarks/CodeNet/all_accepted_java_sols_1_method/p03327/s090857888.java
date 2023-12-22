import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String ans = n < 1000 ? "ABC" : "ABD";
        System.out.println(ans);
    }
}