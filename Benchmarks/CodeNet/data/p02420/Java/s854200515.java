import java.util.Scanner;

public class Main{      
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        end:
        while(true)
        {
            String str = sc.next();
            while(true)
            {
                String s = sc.next();
                if(s=="-")
                    break end;
                n=Integer.parseInt(s);
                String str2;
                str2 = str.substring(0,n);
                str.delete(0,n);
                str.append(str2);
            }
        }
    }
}

