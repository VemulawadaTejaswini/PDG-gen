import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char [] odd = sc.next().toCharArray();
		char[] even = sc.next().toCharArray();
		
		for(int i = 0;i < even.length; i++) {
			System.out.print(odd[i]);
			System.out.print(even[i]);
		}
		if(odd.length-even.length==1) {
			System.out.print(odd[odd.length-1]);
		}
	}

}