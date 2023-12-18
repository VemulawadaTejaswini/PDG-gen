import java.util.Scanner;

public class Main{
	public Main(){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n == -1){
				break;
			} else if(n == 0){
				System.out.println(n);
				continue;
			}
			
			String str = "";
			while(n > 0){
				str = n%4 + str;
				n /= 4;
			}
			System.out.println(str);
		}
	}
	
	public static void main(String[] args){
		new Main();
	}
}