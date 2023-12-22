import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int n = 0;
		int num = 0;
		while(sc.hasNext()){
			String[] st = sc.nextLine().split(",");
			num += Integer.parseInt(st[1]);
			sum += Integer.parseInt(st[0])*Integer.parseInt(st[1]);
			n++;
		}
		System.out.println(sum);
		System.out.println((int)Math.ceil((double)num/n));
		sc.close();
	}
}