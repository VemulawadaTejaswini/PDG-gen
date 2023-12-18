import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		String s=a+a;
		if(s.indexOf(b)!=-1){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		}


}
