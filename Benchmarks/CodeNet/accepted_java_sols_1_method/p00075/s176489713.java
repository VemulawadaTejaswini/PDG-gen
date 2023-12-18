import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String s = sc.next();
			int i=0;
			int start=0;
			while(s.substring(i,i+1).compareTo(",")!=0)i++;
			int a = Integer.valueOf(s.substring(start,i));
			i++;
			start = i;
			while(s.substring(i,i+1).compareTo(",")!=0)i++;
			double b = Double.valueOf(s.substring(start,i));
			double c = Double.valueOf(s.substring(i+1,s.length()));
			
			if(b/(c*c)>=25){
				System.out.println(a);
			}
		}
			
	}
}