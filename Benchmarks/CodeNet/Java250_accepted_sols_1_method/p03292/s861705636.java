import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int ttl[] = new int[6];
		
		ttl[0] = Math.abs(a-b);
		ttl[0] = ttl[0] + Math.abs(b-c);
		ttl[1] = Math.abs(a-c);
		ttl[1] = ttl[1] + Math.abs(c-b);
		ttl[2] = Math.abs(b-a);
		ttl[2] = ttl[2] + Math.abs(a-c);
		ttl[3] = Math.abs(b-c);
		ttl[3] = ttl[3] + Math.abs(c-a);
		ttl[4] = Math.abs(c-a);
		ttl[4] = ttl[4] + Math.abs(b-c);
		ttl[5] = Math.abs(c-b);
		ttl[5] = ttl[5] + Math.abs(b-a);
		
		int min = ttl[0];
		for(int i=0; i<5; i++){
			if (min > ttl[i]){
				min = ttl[i];
			}
		}
		
		
		System.out.println(min);
		
	}

}
