import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		String[] str = s.split("");
		
		int c = 0;
		for(int i =0; i <n-1;i++) {
			if(str[i].equals(str[i+1])){
				c++;
			}
		}
		System.out.println(n-c);
	}

}
