import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		if(a==3||a==5||a==7){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
        scan.close();
	}
}