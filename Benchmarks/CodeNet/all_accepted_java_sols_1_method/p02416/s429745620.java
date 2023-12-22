import java.util.Scanner;

public class Main {
	public static Scanner sc;
	
	public static void main(String args[]) {
		//宣言
		//int x[]=new int[2000];
		int y[]=new int[2000];
		String[] strs = new String[2000];
		char[] word = new char[2000];
		sc = new Scanner(System.in);
		int i=1;
		int j=0;
		int sum=0;
		//入力
		//System.out.println("Please input x below");
		for(;;) {
			//x[i]=sc.nextInt();
			strs[i]=sc.next();
			if(strs[i].equals("0")) {
				break;
			}
			i++;	
		}
		//出力
		i=1;
		for(;;) {
			if(strs[i].equals("0")) {
				break;
			}
			for(j=0;j<strs[i].length();j++) {
				word[j]=strs[i].charAt(j);
				y[j]=Character.getNumericValue(word[j]);
				sum+=y[j];
			}
			System.out.println(sum);
			i++;
			sum=0;
		}
	}
}

