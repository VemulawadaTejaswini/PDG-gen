import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String n = String.valueOf(N);
		int num =Integer.valueOf(n.substring(0,1));
		
		if(num<Integer.valueOf(n.substring(1,2))){
			num++;
			System.out.println(""+num+num+num);
		}else if(num<Integer.valueOf(n.substring(2,3))){
			num++;
			System.out.println(""+num+num+num);
		}else {
			System.out.println(""+num+num+num);
		}
		
		sc.close();
	}
}