import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int plusOne = Integer.parseInt(scanner.next());
        int zero = Integer.parseInt(scanner.next());
	    int minusOne = Integer.parseInt(scanner.next());
      	int amount = Integer.parseInt(scanner.next());
		int ans = 0;
      for (int i=0; i<amount; i++) {
      	if (i < plusOne) {
        	ans = ans + 1;
        } else if (i < plusOne + zero) {
        	ans = ans;
        } else {
        	ans = ans - 1;
        }
      }

      System.out.println(ans);

    }
}
