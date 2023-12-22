import java.util.*;
public class Main{

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		n %= 10;
		if(n == 2 || n == 4 || n == 5 || n == 7 || n == 9){
			System.out.print("hon");
		}else if (n == 3){
			System.out.print("bon");
		}else{
			System.out.print("pon");
		}
	}
}

