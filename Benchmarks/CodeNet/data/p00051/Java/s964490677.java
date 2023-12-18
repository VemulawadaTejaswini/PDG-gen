import static java.util.Arrays.*;

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		while(n--!=0){
			String max = "";
			String min = "";

			char[] c = sc.next().toCharArray();
			sort(c);

			for(int i = 0;i < c.length;i++){
				min += c[i];
				max += c[c.length-1-i];
			}
			System.out.println(Integer.parseInt(max)-Integer.parseInt(min));
		}
	}
}