/**
 * 
 */


/**
 * @author Jnaneswar Reddy
 *
 */
import java.util.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scan =new Scanner(System.in);
		n=scan.nextInt();
		scan.nextLine();
		HashMap<String,Integer> m = new HashMap<>();
//		for(int i=0;i<4;i++)
//		{  String s1= scan.nextLine();
//			if(!m.containsKey(s1))
//			{
//				m.put(s1, 0);
//			}
//		}
		m.put("AC", 0);
		m.put("WA", 0);
		m.put("TLE", 0);
		m.put("RE", 0);
		
		
		for(int i=0;i<n;i++)
		{  String s1= new String(scan.nextLine());
			
		if(!m.containsKey(s1))
			{
				m.put(s1, 0);
			}
		else {
				m.put(s1,(m.get(s1)+1));
			
			
		}}
		
	          System.out.println("AC" +
	                             " x " + m.get("AC"));
	          System.out.println("WA" +
                      " x " + m.get("WA"));
	          
	          System.out.println("TLE" +
                      " x " + m.get("TLE"));
	          System.out.println("RE" +
                      " x " + m.get("RE"));
		
	}

}
