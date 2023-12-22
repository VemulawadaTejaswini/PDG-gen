import java.util.*;

public class Main{
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		String S = s.next();
      	int max = 0, n = 0;
      	for (int i = 0; i < S.length(); i++){
          	String SS = S.substring(i, i + 1);
          	//System.out.println(SS);
        	if (SS.equals("A") || SS.equals("T") || SS.equals("G") || SS.equals("C")){
            	n++;
            }
          	else {
            	n = 0;
            }
            if (max < n){
            		max = n;
            }
            //System.out.println(n + " " + max);
            
        }
        System.out.println(max);
	}
}