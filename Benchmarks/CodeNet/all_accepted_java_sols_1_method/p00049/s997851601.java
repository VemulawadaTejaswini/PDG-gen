import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String tmp;
		String[] a;
		int[] ABO = {0, 0, 0, 0};
		while(sc.hasNext()) {
			a = sc.next().split(",");
			if(a[1].equals("A"))		ABO[0]++;
			else if(a[1].equals("B"))	ABO[1]++;
			else if(a[1].equals("AB"))	ABO[2]++;
			else 						ABO[3]++;
		}
		
		for(int i : ABO) {
			System.out.println(i);
		}
	}
}