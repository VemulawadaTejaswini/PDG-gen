import java.util.Scanner;

class Main{
	public static void main(String[] args) 	{
		Scanner sc = new Scanner(System.in);
		while(0 < 1){
			int sum = 0;
			String str = sc.next();
			if(str.length() == 1 && str.charAt(0) == '0') break;
			for(int i = 0;i < str.length();i++) {
				sum += str.charAt(i) - '0';
			}
			System.out.printf("%d\n",sum);
			}
		sc.close();
	}	
}
