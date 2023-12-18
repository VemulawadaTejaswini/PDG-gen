import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


class War {
	public static void main (String[] args) throws java.lang.Exception{
		int n=0;
		int sum=1;
		ArrayList<Integer> h = new ArrayList<Integer>();

		Scanner scan = new Scanner(System.in);
		n=scan.nextInt();

		for(int i=0; i<n; i++){
			h.add(scan.nextInt());
		}

		Collections.sort(h);
		Collections.reverse(h);

		for(int i=0; i<n; i++){
			if(h.get(i) - i/4 <= 0){break;}
			sum += (h.get(i) - i/4);

		}

		System.out.println(sum);
	}
}