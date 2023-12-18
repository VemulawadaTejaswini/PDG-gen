import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
    for(int i=1;; i++)
        {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int num = Integer.parseInt(str);
        if(num != 0)
            {
            System.out.println("Case "+i+": "+num);
            }else{
            break;
            }
        }
    }
    
}