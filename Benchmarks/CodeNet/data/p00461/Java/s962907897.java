import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			final int m = sc.nextInt();
			
			final int size = 2 * n + 1;
			
			char[] input = sc.next().toCharArray();
			
			int count = 0;
			for(int i = 0; i < m; i++){
				if(input[i] == 'I'){
					boolean next_i = false;
					int pos = i + 1;
					
					while(pos < m){
						if(input[pos] == (next_i ? 'I' : 'O')){
							next_i = !next_i;
							pos++;
						}else{
							break;
						}
					}
					
					int len = (pos - i) + (next_i ? -1 : 0);
					if(len >= size){
						count += 1 + (len - size) / 2;
					}
					
					i = pos - 1;
				}
			}
			
			System.out.println(count);
		}
	}

}