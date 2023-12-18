import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i=1;
		int x=1;
		while(x!=0){
			x = sc.nextInt();
			if(x==0){
				break;
			}else{
				System.out.println("case "+i+": "+x);
				i++;
			}
		}
	}
}