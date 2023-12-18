import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	outer:
		for(int i =1; ;i++){
			int x = sc.nextInt();
			if(x == 0){
				break outer;
			}
			else{
				System.out.printf("Case %d: %d",i,x);
			}
		}
	}
}