import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner scan = new Scanner(System.in);
		
		int n=scan.nextInt();
		String str = scan.next();
		char a[] = str.toCharArray();
		
		if(n>=str.length()) {
			System.out.println(str);
		}else {
			for(int i=0;i<n;i++) {
				System.out.print(a[i]);
			}
			System.out.println("...");
		}
		
		
			
		}

	}



