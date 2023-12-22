import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		int count = 1,x=1;
		while(x>0){
			x = scanner.nextInt();
			if(x==0){break;}
			System.out.println("Case "+count+ ": "+x);
			count++;
		}
	}
}