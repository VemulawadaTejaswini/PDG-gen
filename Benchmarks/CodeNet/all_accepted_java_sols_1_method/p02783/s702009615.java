import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int a = sc.nextInt();
		int count = 0;
		boolean flag = true;
		while(flag){
			 h -= a;
			count++;
			if(h<=0){
				flag = false;
			}
		}
System.out.println(count);
	}
}