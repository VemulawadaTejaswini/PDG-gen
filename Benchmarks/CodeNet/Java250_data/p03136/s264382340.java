import java.util.*;
public class Main {
	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        
        String str1 = scan.nextLine();
        
        
        int n = Integer.parseInt(str1);
        int[] l = new int[n];
        for (int i = 0 ; i<n ;i++) {
        	l[i]= Integer.parseInt(scan.next());
        }
        
        int max = 0 ;
        int hen  = 0;
        
        for (int i :l) {
        	if(i>max) {
        		hen += max;
        		max=i;
        	}else {
        		hen +=i;
        	}
        }
        String ans ;
        if (max<hen) {
        	ans = "Yes";
        }else {
        	ans = "No";
        }
        

		System.out.println(ans);
    }
}