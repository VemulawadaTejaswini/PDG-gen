import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int m = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
			
			if(m == -1 && f == -1 && r == -1)break;
			
			int ten = m + f;
			if(m == -1 || f == -1)System.out.println('F');
			else if(ten >= 80)System.out.println('A');
			else if(ten >= 65)System.out.println('B');
			else if(ten >= 50 || r >= 50)System.out.println('C');
			else if(ten >= 30)System.out.println('D');
			else if(ten < 30)System.out.println('F');
		}
	}
}