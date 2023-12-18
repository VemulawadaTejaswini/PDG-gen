import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String S = in.next();
        int max = 0;
         for(int i =0; i< 3; i++)  {
          int prev = S.charAt(i);
          int to =1;
          for(int j =i+1; j<3; j++)  {
             if(prev!=S.charAt(j)) break;
            to++;
          }
          max = Math.max(max, to); 
          
        }
		System.out.println(max);

	}
}
