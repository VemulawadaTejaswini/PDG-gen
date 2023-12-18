import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		List <Integer> a = new ArrayList<Integer>();
		
		String ans ="";
		
	for(int i = 0; n >0; i++) {
	
	 a.add((int)n % 26);
	 if(n == 26) {
		 break;
	 }
		n = n/26;
	//	if(n < 26) {
		//	a.add((int)n);
		//}
	}
	
	 for(int i=a.size()-1; i>=0; i--) {
         switch((int)a.get(i)) {
         case 1:
        	    ans = "a" + ans;
        	    break;
         case 2:
     	    ans = "b" + ans;
     	    break;
         case 3:
     	    ans = "c" + ans;
     	    break;
         case 4:
     	    ans = "d" + ans;
     	    break;
         case 5:
     	    ans = "e" + ans;
     	    break;
         case 6:
     	    ans = "f" + ans;
     	    break;
         case 7:
     	    ans = "g" + ans;
     	    break;
         case 8:
     	    ans = "h" + ans;
     	    break;
         case 9:
     	    ans = "i" + ans;
     	    break;
         case 10:
     	    ans = "j" + ans;
     	    break;
         case 11:
     	    ans = "k" + ans;
     	    break;
         case 12:
     	    ans = "l" + ans;
     	    break;
         case 13:
     	    ans = "m" + ans;
     	    break;
         case 14:
     	    ans = "n" + ans;
     	    break;
         case 15:
     	    ans = "o" + ans;
     	    break;
         case 16:
     	    ans = "p" + ans;
     	    break;
         case 17:
     	    ans = "q" + ans;
     	    break;
         case 18:
     	    ans = "r" + ans;
     	    break;
         case 19:
     	    ans = "s" + ans;
     	    break;
         case 20:
     	    ans = "t" + ans;
     	    break;
         case 21:
     	    ans = "u" + ans;
     	    break;
         case 22:
     	    ans = "v" + ans;
     	    break;
         case 23:
     	    ans = "w" + ans;
     	    break;
         case 24:
     	    ans = "x" + ans;
     	    break;
         case 25:
     	    ans = "y" + ans;
     	    break;
         case 0:
     	    ans = "z" + ans;
     	    break;
     	    
         }
     }
	 StringBuffer str = new StringBuffer(ans);
     String hoge2 = str.reverse().toString();
	 
	System.out.println(hoge2);
		
		
		//String s = sc.next();
		//long n = sc.nextLong();
		//double n = sc.nextDouble();
		
		//for(int i = 0; i < ; i++)

		//System.out.println("Yes");
		//System.out.println("No");
		

	}
}
