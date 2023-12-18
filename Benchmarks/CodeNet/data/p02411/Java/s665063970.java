import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            int sum = 0;
            int m = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();
            if((m == -1 && f == -1) && r == -1)
                break;
            sum = m + f;
            if(m == -1 || f == -1 || sum < 30)
                System.out.println("F");
            else if(sum < 50)
            {
                if(r >= 50)
                    System.out.println("C");
                else
                    System.out.println("D");
            }
            else if(sum < 65)
                System.out.println("C");
            else if(sum < 80)
                System.out.println("B");
            else
                System.out.println("A");
        }
    }
}
