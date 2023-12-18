import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long dog = sc.nextLong();
		String alf = "abcdefghijklmnopqrstuvwxyz";
		int base = alf.length();

		int digitNum = 0; 
		while(Math.pow(base, digitNum + 1) < dog) {
			digitNum++;
		}
		int[] res = new int[digitNum + 1];
		for (int i = digitNum; i > 0; i--) {
			int rankNum = 0;
			while(Math.pow(base, i) * (rankNum + 1) < dog) {
				rankNum++;
			}
			res[digitNum - i] = rankNum;
			dog -= Math.pow(base, i) * rankNum;
		}
		res[digitNum] = (int) dog;
		
		StringBuffer dogName = new StringBuffer();
		for (int i = 0; i < res.length; i++) {
			dogName.append(alf.charAt(res[i] - 1));
		}
		System.out.println(dogName);
	}
}
