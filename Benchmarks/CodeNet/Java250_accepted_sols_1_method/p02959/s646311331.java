import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = Long.parseLong(sc.next());
		List<Long> aList = new ArrayList();
		List<Long> bList = new ArrayList();
		
		for(long i=0; i <= N;i++){
			aList.add(Long.parseLong(sc.next()));
		}
		long totalDamage = 0;
		for(long i=0; i < N;i++){
			long a = Long.parseLong(sc.next());
			bList.add(a);
			totalDamage += a;
		}
		
		long amari = -1;
		long more = 0;
		for(int i=0;i<N;i++){
			long a1 = aList.get(i);
			long a2 = aList.get(i+1);
			long b1 = bList.get(i);
			if(amari!=-1){
				a1 = amari;
			}
			if(a1+a2 >b1){
				amari = b1 > a1? a2-(b1-a1): a2;
			}else if(a1 + a2 < b1){
				amari = 0;
				more += b1 - (a1+a2);
			} else {
				amari = 0;
			}
		}
		System.out.println(totalDamage-more);
	}
}
