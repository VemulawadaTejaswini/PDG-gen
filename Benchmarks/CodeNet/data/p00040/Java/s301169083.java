import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		final List<Integer> alpha_list = Collections.unmodifiableList(Arrays.asList(new Integer[]{5,7,11,17,19,23,25}));
		
		int n = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < n ; i++){
			String str = sc.nextLine();
			
				
			char[] c_str = str.toCharArray();
			char[] tmp_str = str.toCharArray();
			loop:
			for(int alpha = 0;alpha < 26;alpha++){
				for(int beta = 0;beta < 26;beta++){
				
					for(int j = 0; j < c_str.length;j++){
						if(c_str[j] >= 'a' && c_str[j] <= 'z'){
							int tmp = c_str[j] - 'a';
							
							tmp_str[j] = (char)((alpha*tmp + beta) % 26 + 'a');
						}
					}
					
					
					String new_str = new String(tmp_str);
					if(new_str.indexOf("this") != -1 || new_str.indexOf("that") != -1){
						System.out.println(tmp_str);
						break loop;
					}
				}
			}			
		
		}
	}
}