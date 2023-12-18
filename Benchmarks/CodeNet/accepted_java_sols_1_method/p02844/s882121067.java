import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sca = new Scanner(System.in);
		int n = sca.nextInt();
		String str = sca.next();
		int length = str.length();
		int an[] = new int[length];


		int result = 0;
		for(int i = 0; i < length; i++) {
			an[i] = (str.charAt(i) - '0');
		}
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				for(int k = 0; k < 10; k++) {
					int bn[] = new int[3];
					bn[0] = i;
					bn[1] = j;
					bn[2] = k;
					boolean flag1 = false;
					boolean flag2 = false;
					boolean flag3 = false;
					for(int l = 0; l < length; l++) {
						if(flag1 != true && an[l] == bn[0]) {
							flag1 = true;
							continue;
						}
						if(flag1 == true && flag2 != true && an[l] == bn[1]) {
							flag2 = true;
							continue;
						}
						if(flag1 == true && flag2 == true && flag3 != true && an[l] == bn[2]) {
							flag3 = true;
							continue;
						}
					}
					if(flag1 == true && flag2 == true && flag3 == true) {
						result++;
					}
				}
			}
		}
		System.out.println(result);
	}
}
