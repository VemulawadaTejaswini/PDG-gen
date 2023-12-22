import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		String s = sc.next();
		int[] acarr = new int[100000];
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'C' && i != 0 && s.charAt(i - 1) == 'A' && i != 0) {
				count++;
				acarr[i] = count;
			}else {
				acarr[i]=count;
			}
		}

		for(int i=0;i<q;i++) {
			int l1=sc.nextInt()-1;
			int l2=sc.nextInt()-1;
			System.out.println(acarr[l2]-acarr[l1]);
		}
	}
}
