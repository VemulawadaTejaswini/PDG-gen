import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i=0;i<10;++i)
			a.add(sc.nextInt());
		Collections.sort(a);
		for(int i=9;i>=7;--i)
			System.out.println(a.get(i));
	}
}