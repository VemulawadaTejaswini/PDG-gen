import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner src = new Scanner(System.in);

		String s = src.nextLine();
      	String t = src.nextLine();
      
      	

		System.out.println(solve(s,t));
	}

  	public static int solve(String s,String t){
      
      int ans = 0;
      
      int i =0;
      int j = 0;
      
      while(i<s.length() && j<t.length()){
        
        if(s.charAt(i)!=t.charAt(j))
          ans++;
        
        i++;
        j++;
        
      }
      
      return ans;
      
    }

}