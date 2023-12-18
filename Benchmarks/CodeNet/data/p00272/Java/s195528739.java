import java.util.Scanner;

public class Main2 {
	Scanner sc = new Scanner(System.in);
	int t,n,x;
	int sa[]=new int[4];{
		
		for(x=0; x<=4 ;x++){
			t = sc.nextInt();
			n = sc.nextInt();
			switch(t){
			case 1: System.out.println(6000*n);break;
			case 2: System.out.println(4000*n);break;
			case 3: System.out.println(3000*n);break;
			case 4: System.out.println(2000*n);break;
			
			}
		}
	}	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
			Main2 sa = new Main2();
			
	}

}