import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;


public class aoj0001 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] box=new int[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++){
			box[i]=sc.nextInt();
		}
		Arrays.sort(box);
		for(int i=0;i<3;i++)
			System.out.println(box[9-i]);
	}

}