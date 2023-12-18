import java.util.*;

public class Main {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			int count = 0;
			
			for(int a = 0; a < 10; a++){
				for(int b = 0; b < 10; b++){
					for(int c = 0; c < 10; c++){
						for(int d = 0; d < 10; d++){
							if(a + b + c + d == n) count++;
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}