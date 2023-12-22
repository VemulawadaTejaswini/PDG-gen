import java.util.*;

public class Main {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		
		int n;
		
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		for(int i = 0; i < n; i++){
			al.add(sc.nextInt());
		}

		Collections.reverse(al);

		for(int i = 0; i < n - 1; i++){
			System.out.print(al.get(i) + " ");
		}

		System.out.println(al.get(n - 1));
	}
}