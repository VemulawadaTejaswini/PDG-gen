import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int taro=0,hanako=0;
		for(int i=0;i<n;i++) {
			String t = sc.next();
			String h = sc.next();
			int duel = t.compareTo(h);
			if(duel>0) {
				taro += 3;
			}else if(duel<0) {
				hanako += 3;
			}else if(duel==0) {
				taro+=1;
				hanako+=1;
			}
		}
		System.out.println(taro+" "+hanako);
	}

}

