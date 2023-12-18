import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		
		int h=sc.nextInt();		//モンスターHP
		int n=sc.nextInt();		//n種類の必殺技
		
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			h=h-a;
		}
			if(h<=0) {
				 System.out.println("Yes");
			}else {
				 System.out.println("No");
			}
			sc.close();
		}

	}