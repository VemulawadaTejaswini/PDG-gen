import java.util.Scanner;
 
 
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	
		int N = Integer.parseInt(sc.next());
		//int K = Integer.parseInt(sc.next());
		//char[] c = sc.next().toCharArray();
		int MM = N%100;
		int YY = N/100;
		boolean YY_flag;
		boolean MM_flag;
		if(YY == 0 || (13<=YY && YY<= 99) ){
			YY_flag = true;//YY確定
		}else{
			YY_flag = false;
		}
		
		if(1<=MM && MM<=12){
			MM_flag = true;
		}else{
			MM_flag = false;//MM不確定
		}
		
		if(YY_flag){
			if(MM_flag){
				System.out.println("YYMM");
			}else{
				System.out.println("NA");
			}
		}else{
			if(MM_flag){
				System.out.println("AMBIGUOUS");
			}else{
				System.out.println("MMYY");
			}
		}
		
		
		sc.close();
	}
	
	
	
}