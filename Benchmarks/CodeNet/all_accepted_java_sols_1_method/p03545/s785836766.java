import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a = s.charAt(0) - '0', b = s.charAt(1) - '0',
            c = s.charAt(2) - '0', d = s.charAt(3) - '0';
            char p = '+', q = '+', r = '+';

            if(a+b+c+d==7)       p = q = r = '+';
            else if(a+b+c-d==7){ p = q = '+'; r = '-';}
            else if(a+b-c+d==7){ p = r = '+'; q = '-';}
            else if(a+b-c-d==7){ p = '+'; q = r = '-';}
            else if(a-b+c+d==7){ p = '-'; q = r = '+';}
            else if(a-b+c-d==7){ p = r = '-'; q = '+';}
            else if(a-b-c+d==7){ p = q = '-'; r = '+';}
            else                 p = q = r = '-';
            System.out.println(a + "" + p + "" + b + "" + q + "" + c + "" + r + "" + d + "=7");
    }
}