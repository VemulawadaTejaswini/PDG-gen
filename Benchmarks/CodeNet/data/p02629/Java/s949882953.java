import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		String name="";
		while((N/26)>1){
			if(N%26!=0) {
				name = Character.toString(96+((int)N%26)) + name;
			}
			else {
				name = "z"+ name;
			}
			N /= 26;
		}
		if(N%26!=0) {
			name = Character.toString(96+((int)N%26)) + name;
		}
		else {
			name = "z"+ name;
		}
		System.out.println(name);
	}

}