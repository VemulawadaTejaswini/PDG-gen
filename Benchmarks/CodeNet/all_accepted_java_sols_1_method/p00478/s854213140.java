import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String code = sc.next();
		int n = sc.nextInt(),count = 0;
		
		for(int i = 0; i < n; i++){
			String ring = sc.next();
			ring += ring.substring(0, code.length() - 1);
			if(ring.matches(".*" + code + ".*"))count++;
		}
		System.out.println(count);
		
		sc.close();
	}
}