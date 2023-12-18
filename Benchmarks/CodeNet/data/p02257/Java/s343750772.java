import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<String> str = new ArrayList<String>();
		while(in.hasNext()) {
			String buf = in.nextLine();
			str.add(buf);
		}
		
		int facter[];
		facter = new int[str.size()];

		for (int i = 0; i < str.size(); i++) {
			facter[i] = Integer.parseInt(str.get(i));
		}
		
		

		boolean specer = false;
		int count = 0;
		
		for (int i = 0; i < facter.length; i++) {
			boolean isPrime = true;

			if (facter[i] > 1) {
				for (int t = 2; t < facter[i]; t++) {
					if ((facter[i] % t) == 0) {
						isPrime = false;
					}
				}
			}
			if (isPrime == true) {
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	

}