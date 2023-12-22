import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
        int z = a*b;
        if( z % 2 == 0){
		System.out.println("No");
        }else{
		System.out.println("Yes");
        }
	}
}