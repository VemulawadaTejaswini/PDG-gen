import java.util.Scanner;

class Main{
	public static void main(String[] args) 	{
		Scanner sc = new Scanner(System.in);
		while(0 < 1) {
			String str = sc.next();
			StringBuffer strbf = new StringBuffer(str);
			if(str.equals("_")) break;
			int shuffle = sc.nextInt();
			for(int i = 0;i < shuffle;i++) {
				int num = sc.nextInt();
				strbf.append(strbf.substring(num));
				strbf.delete(0, num - 1);
			}
			System.out.println(strbf);
		}
		sc.close();
	}
}
