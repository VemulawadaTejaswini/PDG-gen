import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		
	    List<Integer> n2 = new ArrayList<>();
		List<Integer> m2 = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int d = sc.nextInt();
			n2.add(d);
		}
		for (int i = 0; i < N; i++) {
            int d = sc.nextInt();
			m2.add(d);
		}
		int count = 0;
		
		while(K>0)
		{
			if(n2.size() == 0)
			{
				n2.add(100000001);
			}
			if(m2.size() == 0)
			{
				m2.add(100000001);
			}
			
			
		 if( (n2.get(0)) > (m2.get(0)) )
		 {
			 K -= m2.get(0);
			 m2.remove(0);
		 }
		 else
	     {
			 K -= n2.get(0);
			 n2.remove(0);
		 }
		 if(K>0)
		 {count++;}
		}
		
		
		
		System.out.println(count);
   
        }
		
	}
 