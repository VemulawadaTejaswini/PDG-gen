import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		int count0=0,count1=0;
		for(int i=0;i<s.length();i++) {
			if(s.substring(i,i+1).equals("0"))count0++;
			else count1++;
		}
		System.out.println((int)Math.min(count0, count1)*2);
	}
}

