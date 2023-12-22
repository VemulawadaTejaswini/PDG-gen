import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long n = sc.nextLong();
		
		List<Long> aList = new ArrayList<>();
		// List<Long> bList = new ArrayList<>();
		List<Long> diffList = new ArrayList<>();
		long sumA =0;
		long sumB =0;

		for(long i=0;i<n;i++){
			long a =sc.nextLong();
			aList.add(a);
			sumA += a;
		}
		for(long i=0;i<n;i++){
			long b =sc.nextLong();
			// bList.add(b);
			sumB += b;
			diffList.add(b -aList.get((int)i));
		}

		if(sumA<sumB){
			System.out.println(-1);
		}else{

		Collections.sort(diffList);
			long totalNeed = diffList.stream()
			.filter(d->d>0)
			.mapToLong(x -> x)
			.sum();
			long resultCount = diffList.stream()
			.filter(d->d>0)
			.mapToLong(x -> x)
			.count();
			
			// System.out.println(diffList);
			// System.out.println(totalNeed);
			// System.out.println(resultCount);

			if(totalNeed ==0){
				System.out.println(0);
			}else{
				for (long i = 0; i <diffList.size(); i++) {
					// System.out.println("i "+i);
					long curSupplier = diffList.get((int)i);
					totalNeed += curSupplier;
					resultCount++;
					// System.out.println("curSup "+curSupplier);
					// System.out.println("resultCount "+resultCount);
					if(totalNeed<=0){
						break;
					}
					
				}
				
				System.out.println(resultCount);
			}



		}


	}

}