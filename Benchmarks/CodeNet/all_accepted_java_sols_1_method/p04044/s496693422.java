import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 int N=sc.nextInt();
		 int L=sc.nextInt();
		 ArrayList<String> S=new ArrayList<>();
		 for(int i=0;i<N;i++) {
			 S.add(sc.next());
		 }
		 Collections.sort(S);
		 
		 for(int i=0;i<N;i++)
			 System.out.print(S.get(i));
	     sc.close();
	 }
}
