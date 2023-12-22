import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m=sc.nextInt();
		String gomi = sc.nextLine();
		for(int i=0;i<m;++i){
			String data = sc.nextLine();
			int size = data.length();
			HashSet<String> set = new HashSet<String>();
			for(int j=0;j<size-1;++j){
				StringBuffer a = new StringBuffer(data.substring(0,j+1));
				StringBuffer b = new StringBuffer(data.substring(j+1,size));
				set.add(a.toString()+b.toString());
				set.add(a.toString()+b.reverse().toString());
				set.add(a.reverse().toString()+b.toString());
				set.add(a.toString()+b.reverse().toString());
				
				set.add(b.toString()+a.toString());
				set.add(b.toString()+a.reverse().toString());
				set.add(b.reverse().toString()+a.toString());
				set.add(b.toString()+a.reverse().toString());
			}
			System.out.println(set.size());
		}
	}
}

