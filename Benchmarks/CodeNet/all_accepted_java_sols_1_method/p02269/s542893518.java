
import java.util.HashSet;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
		HashSet<String> s = new HashSet<String>();
		 int n=sc.nextInt();
		 for(int i=0; i<n; i++){
			 String t=sc.next();
			 String r=sc.next();
			 if(t.equals("insert")){
				 s.add(r);
			 }else if(t.equals("find") && s.contains(r)){
				 System.out.println("yes");
			 }else if(t.equals("find") && !s.contains(r)){
				 System.out.println("no");
			 }
		 }

	}



}
