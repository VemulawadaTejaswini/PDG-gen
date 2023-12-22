import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

//		ArrayList<Integer> p=new ArrayList<Integer>();
		int N = scanner.nextInt();
		int p[] = new int[N];
		int counter=0;

		for(int i=0;i<N;i++) {
			p[i]=scanner.nextInt();
		}

		if(p[0]-p[1]!=-1) counter++;
//		System.out.println(counter);

		for(int i=1;i<N-2;i++) {
			if(p[i]-p[i+1]!=-1) {
				counter++;
				i++;
			}
		}

		if(p[N-2]-p[N-1]!=-1) counter++;
//		System.out.println(counter);

//		System.out.println(counter);
		if(counter==0||counter==2) System.out.println("YES");
		else System.out.println("NO");

		scanner.close();


	}

}
