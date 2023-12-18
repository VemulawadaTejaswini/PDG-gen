import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
    	int m = scn.nextInt();
    	int n = scn.nextInt();
      int sum = 0;
      if(n>0){
        sum += n*(n-1)/2;
      }
      if(m>0){
        sum += m*(m-1)/2;
      }
      System.out.println(sum);
	}
}
