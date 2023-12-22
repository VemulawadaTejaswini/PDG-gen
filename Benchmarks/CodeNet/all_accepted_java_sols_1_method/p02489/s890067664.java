import java.util.Scanner;

public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int a;
		for(int i=1; ;i++){
			a=sc.nextInt();
			if(a==0){
				break;
			}
			else{
				System.out.println("Case "+i+": "+a);
			}
		}
	}
}