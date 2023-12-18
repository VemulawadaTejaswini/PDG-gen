import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i,x;
		Scanner sc = new Scanner(System.in);
		for(i=0;sc.nextInt() != 0;i++){
			x = sc.nextInt();
			System.out.println("case "+(i+1)+" : "+x);
		}
	}

}
