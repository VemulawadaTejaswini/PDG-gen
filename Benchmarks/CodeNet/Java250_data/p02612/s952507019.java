import java.util.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        
        int n = sc.nextInt();
        
        int moneyCount = 1;
        int money = 1000;
        
        while (money * moneyCount < n) {
            moneyCount++;
        }
        
        int result = money * moneyCount - n;
        
        System.out.println(result);
        
    }
}