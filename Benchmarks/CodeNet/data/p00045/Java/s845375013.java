import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		String str;
		int t, n, i = 0;
		int sum = 0, ave = 0;
		
		while(true){
			str = scan.next();
			if(str.equals("0"))break;
			String[] num = str.split(",", 0);
			
			t = Integer.parseInt(num[0]);
			n = Integer.parseInt(num[1]);
			
			sum += t * n;
			ave += n;
			i++;
		}
		System.out.println(sum);
		System.out.println(Math.round(ave / i));
	}
}