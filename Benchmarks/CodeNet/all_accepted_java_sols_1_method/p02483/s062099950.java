import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sanner=new Scanner(System.in);
		String[] s=sanner.nextLine().split(" ");
		int[] i=new int[3];
		for(int j=0;j<3;j++){
			i[j]=Integer.parseInt(s[j]);
		}
		Arrays.sort(i);
		System.out.println(i[0]+" "+i[1]+" "+i[2]);
	}
}