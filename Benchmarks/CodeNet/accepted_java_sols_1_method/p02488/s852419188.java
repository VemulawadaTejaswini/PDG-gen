import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str[] = new String[n];
		String temp;

		for(int i=0; i<n; i++){
			str[i] = sc.next();
		}

		temp = str[0];
		for(int i=1; i<n; i++){
			if(str[i].compareTo(temp) < 0){
				temp = str[i];
			}
		}
		System.out.println(temp);
	}
}