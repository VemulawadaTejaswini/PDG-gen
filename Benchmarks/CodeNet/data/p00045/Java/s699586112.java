import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		String str;
		int t, n;
		int sum = 0, ave = 0;
		
		while(scan.hasNext()){
			str = scan.next();
			String[] num = str.split(",", 0);
			
			t = Integer.parseInt(num[0]);
			n = Integer.parseInt(num[1]);
			
			sum += t * n;
			ave += n;
		}
		System.out.println(sum);
		System.out.println(Math.round(sum / ave));
	}
}