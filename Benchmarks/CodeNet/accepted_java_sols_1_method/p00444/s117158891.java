import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			
			int count = 0;
			int rst = 1000-n;
			
			count += rst/500;
			rst %= 500;
			count += rst/100;
			rst %= 100;
			count += rst/50;
			rst %= 50;
			count += rst/10;
			rst %= 10;
			count += rst/5;
			rst %= 5;
			count += rst;
			
			System.out.println(count);
		}
	}
}