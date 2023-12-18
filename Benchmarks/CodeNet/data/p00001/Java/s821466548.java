import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		List<Integer> A=new ArrayList<>();
		
		for(int i=0;i<10;i++)A.add(in.nextInt());
		Collections.sort(A, Collections.reverseOrder());
		for(int i=0;i<3;i++)System.out.println(A.get(i));
	}
}

