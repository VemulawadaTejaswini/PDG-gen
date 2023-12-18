import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		 Scanner sc = new Scanner(System.in);
	     int S = sc.nextInt();
	     int h = S/3600 ;
	     int m = (S-h*3600)/60;
	     int s = S-h*3600-m*60;
	     
	     System.out.println(h+ "" +":"+ "" +m+ "" +":"+ "" +s);

	    
	     
	}

}
