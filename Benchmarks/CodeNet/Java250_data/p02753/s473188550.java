import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        boolean sa=false,sb=false;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='A')
            sa=true;
            if(s.charAt(i)=='B')
            sb=true;
        }
        if(sa && sb)
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}