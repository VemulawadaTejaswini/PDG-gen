import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;

		for(;;){
			String str = sc.next();
			if(str.equals("-"))break;
			String[] strArray = str.split("");
			String[] ans = new String[strArray.length];
			//String[] sans = new String[strArray.length];
			int m = sc.nextInt();

			for(int i=0; i<m; i++){
				int h = sc.nextInt();

				for(int j=0; j<strArray.length; j++){
					int add = j + h;
					if(add>=strArray.length){
						num = add - strArray.length;
					}else{
						num = add;
					}
					ans[j]=strArray[num];
				}

				for(int j=0; j<strArray.length; j++){
					strArray[j]=ans[j];
				}
			}
			for(int j=0; j<ans.length; j++){
				System.out.print(ans[j]);
			}
			System.out.println();
		}
	}
}
