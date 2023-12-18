import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int i = sc.nextInt();
		if(i!=0){
			for(;i!=0;i--){
				a *= i;
			}
		}
		System.out.println(a);
	}
}