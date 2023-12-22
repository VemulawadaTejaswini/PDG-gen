import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		String[] model="ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
		String[] S=sc.next().split("");

		for(String s:S) {
			for(int i=0;i<model.length;i++) {
				if(s.equals(model[i])) {
					int index=N+i;
					System.out.print(model[index%26]);
				}
			}
		}
	}
}