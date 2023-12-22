import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int w = sc.nextInt();
        //String ans = "x";
        StringBuilder sb = new StringBuilder();
        int i=0;
        while(i<S.length()){
            if(i%w==0) sb.append(S.charAt(i));
            i++;
        }
        System.out.println(sb.toString());
    }
}