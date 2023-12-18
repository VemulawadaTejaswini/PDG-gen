import java.util.*;

public class Main {
	
	
	public static int MinorChange(String s ,String t) {
		int count = 0;
		
		 char[] arr1 = s.toCharArray();
		 char[] arr2 = t.toCharArray();
//		 
//		 Arrays.sort(arr1);
//		 Arrays.sort(arr2);
		for(int i=0,j=0;i<s.length();i++,j++)
		{
			if(arr1[i]!=arr2[j]) {
				count++;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		Scanner s1 = new Scanner (System.in); 
		String s =s1.next();
		String t = s1.next();
		System.out.println(MinorChange(s, t));
		

	}

}
