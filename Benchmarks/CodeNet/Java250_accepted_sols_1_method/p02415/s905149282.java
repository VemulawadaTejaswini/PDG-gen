import java.util.*;

public class Main{      
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        for (int i=0;i<str.length();i++) {
            if('a'<=chars[i]&&chars[i]<='z')
                chars[i]= Character.toUpperCase(chars[i]);
            else if('A'<=chars[i]&&chars[i]<='Z')
                chars[i]= Character.toLowerCase(chars[i]);
        }
        String str2 = String.valueOf(chars);
        System.out.println(str2);
    }
}

