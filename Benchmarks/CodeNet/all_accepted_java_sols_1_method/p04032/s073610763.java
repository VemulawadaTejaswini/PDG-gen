import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String t=sc.next();
		
		for(int i=0;i<t.length()-1;i++){
			if(t.charAt(i)==t.charAt(i+1)){
				System.out.println((i+1)+" "+(i+2));
				return;
			}
		}
		for(int i=0;i<t.length()-2;i++){
			if(t.charAt(i)==t.charAt(i+2)) {
				System.out.println((i+1)+" "+(i+3));
				return;
			}
		}
		System.out.println(-1+" "+-1);
	}
}
