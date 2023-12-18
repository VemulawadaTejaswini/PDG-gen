import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] cup = new boolean[3];
		cup[0] = true;
		cup[1] = false;
		cup[2] = false;
		
		while(sc.hasNext()){
			String s = sc.next();
			String t = s.substring(0,1);
			String u = s.substring(2,3);
			int x=0;
			int y=0;
			if(t.compareTo("B")==0)x=1;
			if(t.compareTo("C")==0)x=2;
			if(u.compareTo("B")==0)y=1;
			if(u.compareTo("C")==0)y=2;
			
			boolean z = cup[x];
			cup[x] = cup[y];
			cup[y] = z;
		}

		if(cup[0]==true)System.out.println("A");
		if(cup[1]==true)System.out.println("B");
		if(cup[2]==true)System.out.println("C");
	}
}