import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		Scanner scan = new Scanner(System.in);

		int c=0;
		while(true){
			int a = scan.nextInt();
			int b = scan.nextInt();

			if(a==0 && b==0)
				break;

			if(c!=0)
				System.out.println();
			boolean f = false;
			for(int i=a; i<=b;i++){
				if(i%4==0 && ( i%100!=0  || (i%100==0 && i%400==0) ) ){
					System.out.println(i);
					f=true;
				}
			}
			if(!f)
				System.out.println("NA");

			c++;
		}
	}

}