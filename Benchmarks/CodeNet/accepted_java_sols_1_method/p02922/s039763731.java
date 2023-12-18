import java.util.*;

class Main {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int s= 0;
		
		if(B == 1) {
			System.out.println(0);
			return;
		}
		
		for(int i = 1;;i++){
			if((i*(A-1)) + 1 >= B){
				s = i;
				break;
			}
			
		}
		System.out.println(s);
	}
}