import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();		//すぬけ人数
		int k=sc.nextInt();		//お菓子種類
	
		ArrayList<Integer>array=new ArrayList<>();
		
		for(int i=0;i<k;i++) {
			int d=sc.nextInt();		//お菓子の種類
			
			for(int m=0;m<d;m++) {		
				int sunu=sc.nextInt();
				if(!array.contains(sunu)) {
					array.add(sunu);
				}
			}
		}
		System.out.println(n-array.size());
		sc.close();
	}

}