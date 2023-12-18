import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] sum = new int[26];
		while(true) {

			String line = sc.nextLine();
			if(line == null){
				break;
			} else {
				char[] chars =  line.toCharArray();
				for(int i = 0;i < chars.length; i++) {
					for(int j = 0;j < 26; j++) {
						if(chars[i] == 'a' + j || chars[i] == 'A' + j) {
							sum[j]++;
						}
					}
				}
			}
		}

		for(int i = 0;i < sum.length;i++) {
			int ab = 'a' + i;

			System.out.println((char)ab + " : " + sum[i]);
		}
	}
}