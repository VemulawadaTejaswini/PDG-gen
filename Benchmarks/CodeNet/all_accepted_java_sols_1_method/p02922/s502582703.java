import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int i = 0;
		while((a - 1) * i + 1 < b) {
			//if(a * i >= b) break;
			//else 
			i++;
		}
		System.out.println(i);
	}

}