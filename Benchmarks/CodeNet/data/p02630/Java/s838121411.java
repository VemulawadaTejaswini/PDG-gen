/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static int sumer(List<Integer> ls){
        int sum = 0;
        for(Integer var : ls){
            sum += var;
        }
        return sum;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    List<Integer> ls = new ArrayList<>();
	    for(int i = 0;i<n;i++)
	        ls.add(sc.nextInt());
	   
	    int q = sc.nextInt();
	    while(q --> 0){
	        int b = sc.nextInt();
	        int c = sc.nextInt();
	        int maxVal = Math.max(b,c);
	        List<Integer> tempReserved = new ArrayList<>(ls);
	        Collections.replaceAll(ls,b,c);
	       // Collections.replaceAll(ls,c,maxVal);
	        System.out.println(sumer(ls));
	    }
	}
	
}
