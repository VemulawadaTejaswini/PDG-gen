import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int ave = 0;
		int count = 0;
		while(scan.hasNext()){
			String[] str = (scan.nextLine()).split(",");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			count++;
			sum += a*b;
			ave += b;
		}
		System.out.println(sum + "\n" + (int)(((double)ave/count)+0.5));
	}
}