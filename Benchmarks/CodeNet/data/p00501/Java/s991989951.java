import java.util.Scanner;
public class Main {
	static int num = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		int frequency = stdIn.nextInt();
		String str = stdIn.next();
		char[] str_array = str.toCharArray();
		
		for(int r = 0; r < frequency; r++) {
			String input = stdIn.next();
			char[] input_array = input.toCharArray();
			int idx1 = 0, idx2;
		END:	for(int c = 0; c < input_array.length; c++) {
				if(input_array[c] == str_array[0]) {//b探し
					for(int td = c; td < input_array.length; td++) {
						if(input_array[td] == str_array[1]) {//a探し
							idx2 = 2;
							if(td + (td - c) < input_array.length) idx1 = td + (td - c); //debug
							boolean flag = false;
							for(;;) {
								if(str_array[idx2] == input_array[idx1]) {
									if(idx2 + 1 < str_array.length)  idx2++;
									flag = true;
								} else {
									break;
								}
								if(idx2 == str_array.length - 1 || flag == true) {
									num++;
									break END;
								}
							} 
						}
					}
				}
			}
		}
	System.out.println(num);
	}
}