import java.util.Scanner;

public class p0019{
	public p0019(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = 1;
		
		while(n > 1){
			t *= n--;
		}
		
		System.out.println(t);
	}

	public static void main(String[] args){
		p0019 test = new p0019();
	}
}