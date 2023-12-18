import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		char[] arr = sc.nextLine().toCharArray();
		sc.close();

		int totalWest=0;
		int[] wCounts = new int[arr.length];
		for(int i=0; i<wCounts.length; i++) {
			wCounts[i]=(i == 0 ? 0 : wCounts[i-1]);
			if (arr[i]=='W') {
				totalWest++;
				wCounts[i]++;
			}
		}

//		System.out.println("totalW: "+totalWest);
//		for(int i=0; i<wCounts.length; i++)
//			System.out.print(wCounts[i]+", ");
//		System.out.println();

		int min = arr.length;
		for(int i=0; i<arr.length; i++) {
			int tmpWest = totalWest-wCounts[i];
			int wHenkou = wCounts[i];
			if (arr[i]=='W')
				wHenkou--;
			int eHenkou = arr.length - (i+1) - tmpWest;
			int tmp = wHenkou + eHenkou;
//			System.out.println("\t"+i+": "+wHenkou+" + "+eHenkou+" = "+tmp+", tmpwest="+tmpWest);

			if (min > tmp)
				min = tmp;
		}
		System.out.println(min);
	}
}
