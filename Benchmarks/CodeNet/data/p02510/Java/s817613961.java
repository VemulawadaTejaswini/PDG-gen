import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		ArrayList<String> shuff= new ArrayList<String>();
		int m,h;
		String s,result;
		while (in.hasNext()){
			s=in.next();
			if (s.equals("-")) {
				break;
			}
			m=in.nextInt();
			for (int i=0;i<m;i++) {
				h=in.nextInt();
				s=s.substring(h,s.length())+s.substring(0,h);
			}
			shuff.add(s);
		}
		for(int j=0;j<shuff.size();j++){
			System.out.printf("%s%n",shuff.get(j));
		}
	}
}