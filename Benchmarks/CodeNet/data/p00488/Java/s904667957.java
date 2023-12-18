import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int a=0,b=0,c;
		for(int i = 0;i < 3;i++){
			c=in.nextInt();
			if(i == 0) a = c;
			else{
				if(a > c){
					a = c;
				}
			}
		}
		for(int i = 0;i < 2;i++){
			c=in.nextInt();
			if(i == 0) b = c;
			else{
				if(b > c){
					b = c;
				}
			}
		}
		c = a + b - 50;
		System.out.println(c);
	}
}