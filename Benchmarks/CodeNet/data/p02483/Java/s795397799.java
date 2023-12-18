import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max = 0;
		int mid = 0;
		int min = 0;
		if(a > b){
			if(c > a){
				max = c;
				mid = a;
				min = b;
			}
			else{
				max = a;
				if(c > b){
					mid = c;
					min = b;
				}
				else{
					mid = b;
					min = c;
					
				}
			}
		}
		else{
			if(c > b){
				max = c;
				mid = b;
				min = a;
			}
			else{
				max = b;
				if(c > a){
					mid = c;
					min = a;
				}
				else{
					mid = a;
					min = c;
					
				}
			}
			
		}
		
		System.out.println(min + " " + mid + " " + max);

	}

}