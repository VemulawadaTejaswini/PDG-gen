import java.util.Scanner;

public interface Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1;
		while(sc.hasNext()) {
			int a = sc.nextInt();
			if(a==0) break;
			System.out.printf("Case %d: %d\n",n,a);
			n++;
		}
		
		
	}
}

