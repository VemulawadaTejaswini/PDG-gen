import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int tmp = 0;
        if(a < b)
        {
            if(a > c)
            {
                tmp = c;
                c = b;
                b = a;
                a = tmp;
            }
            else
            {
                if(b > c)
                {
                    tmp = c; 
                    c = b;
                    b = tmp;
                }
            }
        }
        else
        {
            if(a < c)
            {
                tmp = a;
                a = b;
                b = tmp;
            }
            else
            {
                if(b > c)
                {
                    tmp = a;
                    a = c;
                    c = tmp;
                }
                else
                {
                    tmp = a;
                    a = b;
                    b = c;
                    c = tmp;
                }
            }
        }
        System.out.println(a + " " + b + " " + c);
    }
}
