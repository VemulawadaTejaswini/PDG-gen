import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String s = String.valueOf(N);

        if((s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2) && s.charAt(2) == s.charAt(3) && s.charAt(3) == s.charAt(0)||
            (s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2) && s.charAt(2) == s.charAt(0))||
            (s.charAt(1) == s.charAt(2) && s.charAt(2) == s.charAt(3) && s.charAt(3) == s.charAt(1)))){
                System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}