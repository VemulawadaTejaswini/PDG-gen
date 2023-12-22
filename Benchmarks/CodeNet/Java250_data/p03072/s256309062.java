import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		String inputN = scanner.nextLine();
		String inputH = scanner.nextLine();

		scanner.close();
		
		int n = Integer.parseInt(inputN);
		String[] hsStr = inputH.split(" ", 0);
		
		Integer[] hs = new Integer[hsStr.length];
		for(int i = 0; i < hsStr.length ; i++) {
			hs[i] = Integer.parseInt(hsStr[i]);
		}

		int viewable = 0;
		int curHighest = 0;
		for(int hn = 0; hn < hs.length; hn++) {
			if(curHighest <= hs[hn]) {
				curHighest = hs[hn];
				viewable++;
			}
		}
		System.out.println(viewable);
	}
}