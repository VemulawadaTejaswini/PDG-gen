import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		char[] array = sc.next().toCharArray();
		int onecount=0;
		int zerocount=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]=='1') onecount++;
			else zerocount++;
		}
		System.out.println(Math.min(zerocount,onecount)*2);
		}
}
