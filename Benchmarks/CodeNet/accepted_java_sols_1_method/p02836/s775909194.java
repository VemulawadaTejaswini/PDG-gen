import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hugs = 0;
		String a = sc.next();
		char[] pal = a.toCharArray();
		for(int i=0,j=pal.length-1;i<=j;i++,j--)
		{
			
			if(pal[i]!=pal[j]) {
				hugs++;
				
			}
			
		}
		
		System.out.println(hugs);
	}	
}