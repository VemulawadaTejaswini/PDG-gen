import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int input;
		int a,b,c,d;
		int count=0;
		int tmp_a, tmp_b, tmp_c;
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			input = scanner.nextInt();
			
			for(a=9; a>=0; a--){
				if( (tmp_a = (input - a)) >= 0){
					for(b=9; b>=0; b--){
						if((tmp_b = (tmp_a - b)) >= 0){
							for(c=9; c>=0; c--){
								if((tmp_c = (tmp_b - c)) >= 0){
									if(tmp_c <= 9){
										count++;
									}
								}
							}
						}
					}
				}
			}
			System.out.println(count);
			count = 0;
		}
	}
}