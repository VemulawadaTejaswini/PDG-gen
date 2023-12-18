import java.util.Scanner;
public class Main {
	public static void main(String argsp[]){
		Scanner sc = new Scanner(System.in);
		int a = 0;
		String s = sc.next(), t = sc.next();
		for(int i = 0; i< 3; i++){
			if(s.charAt(i) == t.charAt(i)){
				a++;
			}
		}
		System.out.print(a);
	}
}