import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		boolean key=false;
		for(int i=1;i<10;i++){
			if(N%i==0&&N/i<10)
				key=true;
		}
		if(key)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}