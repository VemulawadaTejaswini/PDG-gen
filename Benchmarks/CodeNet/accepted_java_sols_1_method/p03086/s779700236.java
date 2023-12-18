import java.util.Scanner;

class Main {
	public static void main(String[] args) {
	
		Scanner stdIn = new Scanner(System.in);
		
		String s = stdIn.next();
		String[] fig;
		int count = 0;
		int max = 0;
		
		fig = s.split("");
		
		for (int i = 0; i < s.length(); ++i) {
			if (fig[i].equals("A")||fig[i].equals("T")||fig[i].equals("G")||fig[i].equals("C")) {
				++count;
				if (max < count) {
					max = count;
				}
			} else {
				count = 0;
			}
		}
		
		System.out.println(max);
		
	}
}