
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n, i, min, max, cnt;
		long sum = 0;
		ArrayList<Integer> I = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(cnt = 0; cnt < n; cnt++){
			i = sc.nextInt();
			I.add(new Integer(i));
		}
		max = I.get(new Integer(0));
		min = I.get(new Integer(0));
		for(cnt = 0; cnt < n; cnt++){
			if(min > I.get(new Integer(cnt))){
				min = I.get(new Integer(cnt));
			}else if(max < I.get(new Integer(cnt))){
				max = I.get(new Integer(cnt));
			}
			sum += I.get(new Integer(cnt));
		}
		System.out.println(min + " " + max + " " + sum);
	}
}