import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		while(true){
			int n=stdIn.nextInt();
			if(n<1) return;
			for(int i=0;i<9;i++) n-=stdIn.nextInt();
			System.out.println(n);
		}
	}
}