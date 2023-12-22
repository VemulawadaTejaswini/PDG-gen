import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int x = Integer.parseInt(sc.next());
    int coin500 = x / 500;
    int remain = x - coin500 * 500;
    System.out.println(coin500 * 1000 + (remain / 5) * 5);
    }
      
      
}