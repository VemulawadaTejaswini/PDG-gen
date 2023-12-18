import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t=scan.nextInt();
		ArrayList<Integer> list=new ArrayList<Integer>();
		for (int i = 0; i < t; i++) {
			list.add(scan.nextInt());
		}
		int c=scan.nextInt();
		for (int i = 0; i < c; i++) {
			int x=scan.nextInt();
			boolean f=true;
			for (int j = 0; j < list.size(); j++) {
				for (int k = j+1; k < list.size(); k++) {
					if((list.get(j)+list.get(k))==x){
						System.out.println("yes");
						f=false;
					}
				}
			}
			if(f){
				System.out.println("no");
			}
		}
		
	}

}