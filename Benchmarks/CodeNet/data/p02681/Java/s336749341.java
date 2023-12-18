import java.util.Scanner;

class Solution {
	public static void main(String[] args) {
      	Scanner input = new Scanner(System.in);
      	String S = input.nextLine();
      	String T = input.nextLine();
    	new Solution().solve(S, T);
    }
  	private void solve(String s, String t) {
    	 int low = 0;
       int high = s.length();
       while(low < high) {
        if(s.charAt(low) != t.charAt(low))
          System.out.println("No");
       }
       System.out.println("Yes");
    }
}