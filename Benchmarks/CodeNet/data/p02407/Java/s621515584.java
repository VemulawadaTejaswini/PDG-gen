import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner scan = new Scanner(System.in);		
		int n = scan.nextInt();
		int[] ary = new int[n];
		boolean isKeep = true;
		
		while(scan.hasNext()){			
			
			for(int i = 0; i < n; i++){
				
				ary[i] = scan.nextInt();
			}
			scan.close();
			break;
			//isKeep = false;
			
		}
		
		//??????
		for(int i = ary.length - 1; 0 <= i ; i--){
			
			System.out.print(ary[i]);
			if(i != 0){
				System.out.print(" ");
			}
		}
			
	}
		
}