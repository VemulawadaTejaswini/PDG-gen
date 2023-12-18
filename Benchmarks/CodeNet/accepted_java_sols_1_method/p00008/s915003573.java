import java.util.Scanner;

public class Main{

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		while(scan.hasNext()){
			String s = scan.next();
			int n = Integer.parseInt(s);
			int m = 0;
			for(int i = 0;i <=9;i++){
				for(int j = 0;j <=9;j++){
					for(int k = 0;k <=9;k++){
						for(int l = 0;l <=9;l++){
							if(i + j + k + l == n){
								m++;
							}
						}
					}
				}
			}
			System.out.println(m);
		}
		System.exit(0);
	}
}