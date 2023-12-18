import java.util.Scanner;
//import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = 0;
		for(int i=1; i<=5; i++){
			if(sc.nextInt() == 0){
				a = i;
			}
		}
		System.out.println(a);
	}
}
