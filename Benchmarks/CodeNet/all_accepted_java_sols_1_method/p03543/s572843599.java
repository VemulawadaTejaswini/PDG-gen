import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		//String t = sc.next();
		//long n = sc.nextLong();
		//long m = sc.nextLong();
		//long k = sc.nextLong();
		long count=0;

		for(int i=0;i<3;i++) {
			if(s.substring(i,i+1).equals(s.substring(i+1,i+2))) {
				count++;
			}else if(i!=2){
				count=0;
			}
		}
		if(count>=2) {
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		//System.out.println(count);
	}
}


