import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int eat = sc.nextInt();
        
        int ans = eat*800 - eat /15 * 200;
        
        System.out.println(ans);
    }
}