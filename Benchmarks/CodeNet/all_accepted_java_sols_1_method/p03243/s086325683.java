import java.util.*;
class Main {
	public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
      	int[] res = new int[]{111,222,333,444,555,666,777,888,999};
      	int n = sc.nextInt();
      	int i = 0;
      	while(res[i] < n) {
        	i++;
        }
      	System.out.println(String.valueOf(res[i]));
    }
}