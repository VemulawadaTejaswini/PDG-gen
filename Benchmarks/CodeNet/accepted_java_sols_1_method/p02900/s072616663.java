import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long aTaihi = a;
		long b = sc.nextLong();
		long bTaihi = b;
		List<Long> sosuListA = new ArrayList<Long>();
		sosuListA.add((long)1);
		List<Long> sosuListB = new ArrayList<Long>();
		sosuListB.add((long)1);
		for(long i =2;i < Math.sqrt(aTaihi);) {
			if(a % i == 0) {
				while(a % i == 0) {
					sosuListA.add(i);
					a /=i;
				}
			}
			if(i ==2) {
				i++;
			}else {
				i +=2;
			}
		}
		if(a !=1) {
			sosuListA.add(a);
		}
		for(long i =2;i < Math.sqrt(bTaihi);) {
			if(b % i == 0) {
				while(b % i == 0) {
					sosuListB.add(i);
					b /=i;
				}
			}
			if(i ==2) {
				i++;
			}else {
				i +=2;
			}
		}
		if(b !=1) {
			sosuListB.add(b);
		}
		List<Long> sosuListADistinct = new ArrayList<Long>();
		for(int i =0;i < sosuListA.size();i++) {
			if(i ==0) {
				sosuListADistinct.add(sosuListA.get(i));
			}else {
				if(sosuListA.get(i) != sosuListA.get(i-1)){
					sosuListADistinct.add(sosuListA.get(i));
				}
			}
		}
		List<Long> sosuListBDistinct = new ArrayList<Long>();
		for(int i =0;i < sosuListB.size();i++) {
			if(i ==0) {
				sosuListBDistinct.add(sosuListB.get(i));
			}else {
				if(sosuListB.get(i) != sosuListB.get(i-1)){
					sosuListBDistinct.add(sosuListB.get(i));
				}
			}
		}
		long answer = 0;
		for(long aElement: sosuListADistinct) {
			for(long bElement: sosuListBDistinct) {
				if(aElement ==bElement) {
					answer++;
				}
			}
		}

		System.out.println(answer);
	}

}