import java.util.Scanner;
//import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		String s = "No";
		if(y % 2 == 0){
			y /= 2;
			for(int i=0; i<=x; i++){
				if(2 * i + (x - i) == y){
					s = "Yes";
					break;
				}
			}
		}
		System.out.println(s);
	}
}
