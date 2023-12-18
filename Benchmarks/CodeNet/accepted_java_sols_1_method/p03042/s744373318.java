import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in) ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = in.next() ;
		String a = str.substring(0,2) ;
		String b = str.substring(2,4) ;
		int a1 = Integer.parseInt(a) ;
		int b1 = Integer.parseInt(b) ;
//		System.out.println(a1+" "+b1);
		int a_pre = 0 ;
		int b_pre = 0 ;
		if(a1>=1&&a1<=12){
			a_pre += 1 ;
		}
		if(b1>=1&&b1<=12){
			b_pre += 1 ;
		}
		
		if(a_pre==0&&b_pre!=0){
			System.out.println("YYMM");
		}
		if(a_pre!=0&&b_pre==0){
			System.out.println("MMYY");		
		}
		if(a_pre==0&&b_pre==0){
			System.out.println("NA");
		}
		if(a_pre!=0&&b_pre!=0){
			System.out.println("AMBIGUOUS");
		}
	}

}
