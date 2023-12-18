import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> al = new ArrayList<>();
		
		int in, tmp = sc.nextInt();
		String asc = "", desc = "";
		String[] sort;
		
		for(int i = 0; i < tmp; i++) {
			in = sc.nextInt();
			sort = String.valueOf(in).split("");
			
			Arrays.sort(sort);
			
			for(int j = 0; j < sort.length; j++) {
				asc += sort[j];
			}
			
			for(int j = sort.length - 1; j >= 0; j--) {
				desc += sort[j];
			}
			
			al.add(Integer.parseInt(desc) - Integer.parseInt(asc));
			
			asc = "";
			desc = "";
		}
		
		
		for(int i : al) {
			System.out.println(i);
		}
	}
}