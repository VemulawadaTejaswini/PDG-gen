import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int nam = sc.nextInt();
		int nam2 = sc.nextInt();
		int nam3 = sc.nextInt();
		
		int sum = nam + nam2 + nam3;
		
		if(sum>21){
		    System.out.print("bust");
		}else{
		    System.out.println("win");
		}
		
	}
}