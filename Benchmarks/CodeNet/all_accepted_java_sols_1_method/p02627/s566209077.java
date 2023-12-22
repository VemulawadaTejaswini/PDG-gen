import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = a.toLowerCase();
		if(a.equals(b)){
			System.out.println('a');
		}else{
			System.out.println('A');
		}
	}

}