import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();
        String t = sc.next();

        char[] s_char = s.toCharArray();
        char[] t_char = t.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<n; i++){
            sb.append(s_char[i]);
            sb.append(t_char[i]);
        }
        System.out.println(sb.toString());

    }

}
