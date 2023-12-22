import java.util.Scanner;

class Main{
	public static void main(String[] args) 	{
		Scanner sc = new Scanner(System.in);
		String kensaku = sc.next();
		int count = 0;
		while(0 < 1) {
			String str = sc.next();
			if(str.equals("END_OF_TEXT")) break;
			if(str.toLowerCase().equals(kensaku)) count++;
		}
		System.out.printf("%d\n",count);
		sc.close();
	}	
}
