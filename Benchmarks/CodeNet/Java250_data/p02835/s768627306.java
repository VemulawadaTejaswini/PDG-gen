import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int tot = sc.nextInt() + sc.nextInt() + sc.nextInt();
		System.out.println(tot < 22 ? "win" : "bust");
	}
}