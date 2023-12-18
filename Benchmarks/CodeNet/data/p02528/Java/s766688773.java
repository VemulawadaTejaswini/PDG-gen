import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		String[] s = scanner.nextLine().split(" ");
		int[] num=new int[s.length];
		for(int i=0;i<s.length;i++)
			num[i]=Integer.parseInt(s[i]);

		sort(num);
	}

	public static void sort(int[] num){
		Arrays.sort(num);
		StringBuilder output=new StringBuilder();
		for(int i=0;i<num.length;i++){
			output.append(num[i]+" ");
		}

		System.out.println(output.toString().trim());
	}

}