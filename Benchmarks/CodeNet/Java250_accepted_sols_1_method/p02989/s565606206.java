import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		ArrayList<Integer>nanido=new ArrayList<>();
		for(int i=0;i<n;i++) {
			nanido.add(sc.nextInt());
		}
		Collections.sort(nanido);
		int hanbun=nanido.size()/2;
		
		int answer=(nanido.get(hanbun))-(nanido.get(hanbun-1));
		
		System.out.println(answer);
		
		/*int answer=(nanido.size()/2)-(nanido.size()/2-1);
		System.out.println(answer);*/
	}

}
