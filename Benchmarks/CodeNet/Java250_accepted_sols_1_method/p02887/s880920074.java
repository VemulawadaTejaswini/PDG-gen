import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		String s=sc.next();

		ArrayList<String>slimes= new ArrayList<>();
		for(int i=0;i<n;i++) {
			slimes.add(s.substring(i,i+1));
		}
		//System.out.println(slimes);
		int count=0;
		for(int j=0;j<slimes.size();j++) {
			if(j==0) {
				count+=1;
			}else {
				//System.out.println(slimes.get(j-1));
				//System.out.println(slimes.get(j));

				if(slimes.get(j).equals(slimes.get(j-1))) {

				}else {
					count+=1;
				}

			}
		}
		System.out.println(count);
	}

}