import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = 0;
        for(int i=0;i<2;i++)
        {
            if(num>num2)
            {
                sum = sum + num;
                num = num - 1;
            }
            else if(num<num2)
            {
                sum = sum + num2;
                num2 = num2-1;
            }
            else
            {
                sum = sum + num;
                num = num - 1;
            }
        }
        System.out.println(sum);
    }
}
