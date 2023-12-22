import java.util.*; 

public class Main{

    static boolean isStrongPalindrome(String s)
    {
        int len=s.length();
        int start;
        int end=s.length();

        for(int i=0;i<s.length()/2;i++)
        {
            if(s.charAt(i)!=s.charAt(len-i-1))
                return false;
        }

        end=(len-1)/2;
        for(int i=0;i<end;i++)
        {
            if(s.charAt(i)!=s.charAt(end-i-1))
                return false;
        }

        start=(len+3)/2;
        end=len;

        for(int i=0;i<end;i++)
        {
            if(s.charAt(i)!=s.charAt(end-i-1))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        
        Scanner in =new Scanner(System.in);

        String s = in.next();

        if(isStrongPalindrome(s))
            System.out.println("Yes");
        else
            System.out.println("No");
        
        in.close();
    }
}
