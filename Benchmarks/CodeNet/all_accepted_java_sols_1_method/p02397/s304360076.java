import java.util.Scanner;

class Main{
	static public void main(String args[]){
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int x = 0;
		int y = 0;

		while(true){
			x = sc.nextInt();
			y = sc.nextInt();

			if(x==0 && y==0)
				break;
			if(x>y)
				sb.append(y + " " + x + "\n");
			else
				sb.append(x + " " + y + "\n");
		}

		System.out.print(sb);
	}
}