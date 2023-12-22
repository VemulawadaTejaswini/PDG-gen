import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        String T = sc.next();
       
        char[] s = S.toCharArray();
        char[] t = T.toCharArray();
      
        ArrayList<Character> ans = new ArrayList<>();
      
        for(int i = 0; i < N; i++){
          ans.add(s[i]);
          ans.add(t[i]);
        }
        
        
       for(int i = 0; i < N*2; i++){
          char next = ans.get(i);
          System.out.print(next);
        }
        System.out.println();
        
      
	}

}



