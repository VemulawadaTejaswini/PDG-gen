import java.util.ArrayList;
import java.util.Scanner;


public class Main{

	final String[] word1 = {"lu","ru","ld","rd"};
	final String[] word2 = {"ru","lu","rd","ld"};
	final int[] value1 = {1,1,0,0};
	final int[] value2 = {0,0,1,1};

	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int index = 0; int count = 0; int state = 1;
			index = sc.nextInt();
			if (index == 0) {
				break;
			} else if (index == 1) {
				for(int i = 0; i < index; i++){
					String str = sc.next();
				}
				continue;
			}
			
			String[] a = new String[index];
			String str = "";
			for (int i = 0; i < index; i++) {
				a[i] = sc.next();
			}

			for(int i = 0; i < index - 1; i++){
				for(int j = 0; j < 4; j++){
					if (a[i].equals(word1[j]) && state == value1[j]) {
						if(a[i + 1].equals(word2[j])) {
							count++;
							state = value2[j];
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}