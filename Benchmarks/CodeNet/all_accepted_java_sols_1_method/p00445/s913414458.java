import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			final char[] str = sc.next().toCharArray();
			
			
			int j_count = 0;
			int i_count = 0;
			for(int i = 0; i < str.length - 2; i++){
				if(str[i] == 'J' && str[i+1] == 'O' && str[i+2] =='I'){
					j_count++;
				}
				
				if(str[i] == 'I' && str[i+1] == 'O' && str[i+2] =='I'){
					i_count++;
				}
			}
			
			System.out.println(j_count);
			System.out.println(i_count);
		}
	}

}