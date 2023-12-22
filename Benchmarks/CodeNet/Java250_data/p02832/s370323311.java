import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		boolean flag = false;
		int breakCount = 0;
		int index = 1;
		for(int i=0;i < count;i++) {
			if(index > count) {
				break;
			}
			if(breakCount == count) {
				break;
			}
			if(sc.nextInt() == index) {
				index++;
				flag = true;
				continue;
			}else {
				breakCount++;
				continue;
			}
		}
		if(flag) {
			System.out.println(breakCount);
		}else {
			System.out.println("-1");
		}
	}
}