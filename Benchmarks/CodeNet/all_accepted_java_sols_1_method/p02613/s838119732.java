import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		
		Scanner in = new java.util.Scanner(System.in);
		int n = in.nextInt();
		int[] count = {0,0,0,0};
		for(int i=0; i<n; i++) {
			String s = in.next();
			switch(s) {
				case "AC":
					count[0]++;
					break;
				case "WA":
					count[1]++;
					break;
				case "TLE":
					count[2]++;
					break;
				case "RE":
					count[3]++;
					break;
				default:
					break;
			}
		}
		
		System.out.println("AC x " + count[0]);
		System.out.println("WA x " + count[1]);
		System.out.println("TLE x " + count[2]);
		System.out.println("RE x " + count[3]);
		
		
		in.close();
	}
}
