import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = 1;
		for (int i=0; i<5; i++) {
			int x = sc.nextInt();
			if (x==0) {
				break;
			}
			num++;
		}				
		System.out.print(num);
		sc.close();
	}

}
