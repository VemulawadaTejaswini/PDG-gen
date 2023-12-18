import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		
		String[] a = new String[sc.nextInt()];
		for(int i = 0; i < a.length; i++)
			a[i] = sc.next();
		
		Arrays.sort(a);
		
		int n = 0;
		for(int i = 0; i < a.length; i++)
			if(i == a.length - 1 || !a[i].equals(a[i + 1]))
				n++;
		System.out.println(n);
		
		sc.close();
    }
}