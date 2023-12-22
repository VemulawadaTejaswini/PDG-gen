import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		for(int p =0; p<5; p++) {
			int num = sc.nextInt();
			al.add(num);
		}
		for(int p=0; p<al.size(); p++) {
			if(al.get(p)==0) {
				System.out.println(p + 1);
			}
		}
	}
}
