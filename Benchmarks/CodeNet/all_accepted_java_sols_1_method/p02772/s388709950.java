import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc=new Scanner(System.in);
		ArrayList<Integer>array=new ArrayList<>();
		int N=sc.nextInt();
		int count=0;
		int notCount=0;
		
		for(int i=0;i<N;i++) {
			array.add(sc.nextInt());
			if(array.get(i)%2==0) {
				if(array.get(i)%3==0||array.get(i)%5==0) {
					count++;
				}else {
					notCount++;
				}
			}
		}
		
		if(notCount!=0) {
			System.out.println("DENIED");
		}else {
			System.out.println("APPROVED");
		}
	}

}
