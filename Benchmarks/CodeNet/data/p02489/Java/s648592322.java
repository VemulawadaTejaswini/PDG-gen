import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int i = 1;
		int n = 1;
		Scanner imput = new Scanner(System.in);	
		while(n == 1){		
			int x = imput.nextInt();
			if(x == 0)break;
			System.out.println("Case "+i+": "+x);
			i++;
		}
	}
}