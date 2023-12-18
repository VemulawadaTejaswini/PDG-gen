import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		int countA,countB,sum=0;
		countA = sc.nextInt();
		List<Integer> s=new ArrayList<Integer>(countA);
		for(int i=0; i<countA; i++) {
			s.add(sc.nextInt());
		}

		countB = sc.nextInt();
		List<Integer> t=new ArrayList<Integer>(countB);
		for(int i=0; i<countB; i++) {
			t.add(sc.nextInt());
		}

		for(int tmp:t)
			if(s.contains(tmp))
				sum ++;
		System.out.println(sum);
	}
}



