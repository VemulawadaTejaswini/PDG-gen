import java.util.*;
import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        int n;
        int result;
        int cal1;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        if(n % 2 == 0){
            result = n / 2;
        }else{
            cal1 = n % 2;
            result = n / 2 + cal1;
        }
        
        System.out.println(result);
    }
}