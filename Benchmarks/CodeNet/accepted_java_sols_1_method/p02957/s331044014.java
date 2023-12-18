import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean flag = false;
		int ans=0;
		Scanner input = new Scanner(System.in);
		int a= input.nextInt();
		int b= input.nextInt();
		
		for(int i =0;i<Math.max(a, b);i++) {
			if(Math.abs(a-i)==Math.abs(b-i)) {
				flag = true;
				ans = i;
			}
		}
		if(flag) {System.out.println(ans);}
		
		else {
			 System.out.println("IMPOSSIBLE");
			
		}
		
	
		

	}

}
