import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int zenbu = sc.nextInt();
        System.out.println((zenbu-(zenbu%2))/2+(zenbu%2));
	}
}