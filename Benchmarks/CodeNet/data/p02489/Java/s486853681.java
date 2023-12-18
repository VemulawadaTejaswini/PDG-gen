import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int x=1;
		int i=1;
		while(x!=0){
			x=s.nextInt();
			if(x==0){
				break;
			}	
			System.out.printf("Case "+i+": "+x+"\n");
			i++;
		}
	}
}