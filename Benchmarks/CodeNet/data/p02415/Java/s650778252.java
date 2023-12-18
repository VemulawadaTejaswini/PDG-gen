import java.util.*;

public class Main{      
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        for (int i=0;i<str.length();i++) {
            if('a'<=chars[i]&&chars[i]<='z')
                chars[i]= Character.toUpperCase(c);
            else if('A'<=chars[i]&&chars[i]<='Z')
                chars[i]= Character.toLowerCase(c);
        }
        String str2 = chars.toString();
        System.out.println(str2);
    }
}

