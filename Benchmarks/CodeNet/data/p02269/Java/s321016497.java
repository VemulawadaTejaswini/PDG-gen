import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		Set<String> dic=new HashSet<String>();
		for(int i=0;i<n;i++){
			String q=sc.next();
			String s=sc.next();
			if(q.equals("insert")){
				dic.add(s);
			}else{
				System.out.println((dic.contains(s)) ? ("yes") : ("no"));
			}
		}

	}

}