import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] bl = new int[4];
		
		while(sc.hasNext()){
			String s = sc.next();
			int i=0;
			while(s.substring(i,i+1).compareTo(",")!=0)i++;		
			String t = s.substring(i+1,s.length());
			if(t.compareTo("A")==0)bl[0]++;
			if(t.compareTo("B")==0)bl[1]++;
			if(t.compareTo("AB")==0)bl[2]++;
			if(t.compareTo("O")==0)bl[3]++;
		}
		for(int i=0;i<4;i++){
			System.out.println(bl[i]);
		}
	}
}