import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			//1000000000000001 = 10^15+1

			long N = scan.nextLong();

			long max = 0;
			long count = 1;

			long num = 0;

			while(true) {
				if(max+1<=N&&N<=max+(long)Math.pow(26,count)) {
					num = N-max;
					break;
				}else{
					max = max+(long)Math.pow(26,count);
					count++;
				}
			}

			//System.out.println(num);
			//System.out.println(count);

			StringBuffer sb = new StringBuffer();
			num--;


			for(int i = 0;i<count;i++) {
				long x = num%26;
				num = num/26;
				char c = (char)(x+97);
				//System.out.println(x);
				sb.append(c);
			}

			String S = sb.reverse().toString();

			//System.out.println();
			System.out.println(S);

		}


	}


}
