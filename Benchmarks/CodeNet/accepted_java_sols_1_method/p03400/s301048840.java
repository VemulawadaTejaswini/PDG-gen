import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int con = 0;
      int ans = c;
      for (int count = 0; count < A; count++){
	      int ac = sc.nextInt();
              int scores[] = new int[A];
	      scores[count] = ac;
              for(int s = 1 ;s<=b;s= s+scores[count])
{con++;}
	    }
      ans = ans + con;
      System.out.println(ans);
   }
 }
