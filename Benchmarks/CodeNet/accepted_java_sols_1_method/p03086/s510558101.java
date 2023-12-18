
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] list = sc.next().toCharArray();
		boolean flag = false;
		int max = 0;
		int tmp = 0;
		for(int i = 0; i < list.length; i++) {
			if(list[i] == 'A' || list[i] == 'T' || list[i] == 'C' || list[i] == 'G') {
				if(!flag) {
					flag = true;
					tmp = 0;
				}
				tmp++;
			} else {
				if(flag) {
					flag = false;
					max = Math.max(max, tmp);
				}
			}
		}
		System.out.println(Math.max(max, tmp));
	}

}
