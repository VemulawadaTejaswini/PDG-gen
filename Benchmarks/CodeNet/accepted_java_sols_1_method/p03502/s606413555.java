import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		String s = Integer.toString(n);
		int nn = 0;
		for(int i=0; i<s.length(); i++){
			nn += Integer.parseInt(s.charAt(i) + "");
		}
		if(n%nn==0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}