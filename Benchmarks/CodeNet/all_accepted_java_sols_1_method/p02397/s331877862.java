import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int num_mem;
    for(int i=1;; i++)
        {
        String str1 = in.next();
        String str2 = in.next();
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        if(num1 == 0 && num2 == 0){break;}
        else{
            if(num1 > num2)
                {num_mem = num1;
                num1 = num2;
                num2 = num_mem;
                }
            System.out.println(num1+" "+num2);
            }
        }
    }
    
}