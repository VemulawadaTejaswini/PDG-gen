import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		ArrayList<String> ary = new ArrayList<String>();
		int a,b,c;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
//		sc.useDelimiter("\\r\\n");

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		for(int i=a;i<=b;i++){
			if(c%i==0){
				cnt++;
			}
		}
		System.out.println(cnt);

		sc.close();
	}

}