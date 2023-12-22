import java.util.*;

public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            char[] chars = sc.next().toCharArray();
            if(chars.length == 1 && chars[0] == '0') break;
            int ans = 0;
            for (char c : chars) {
                ans+= c -'0';
            }
            System.out.println(ans);

        }
        sc.close();
    }
}
