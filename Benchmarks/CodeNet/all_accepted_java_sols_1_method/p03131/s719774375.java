import java.util.*;

public class Main{
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int K = scanner.nextInt();
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		long biscuit = 1;
		boolean money= false;
		if (A+1<B) {
		
		for (long index=0; index<K;) {
			
				for (int index2=0; biscuit<A; index2++) {
					if (index<K) {
						index++;
					} else {
						break;
					}
					biscuit++;
				}
			if (index<K-1) {
				biscuit=biscuit-A;
				index++;
				money = true;
			}
				
			if (index<K && money==true) {
				biscuit=biscuit+B;
				index++;
				money=false;
			}
			if (index==K-1&&money==false){
				biscuit++;
				index++;
			}
		}
		} else {
			biscuit=1+K;
		}
			System.out.println(biscuit);
	}
}