//Volume1-0102
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//initialization
		int    out,
		       runner,
		       score;
		String s;

        //input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0){
        	out    = 0;
        	runner = 0;
        	score  = 0;
        	while(out != 3){
            	s = sc.next();
            	if(s.equals("HIT")){
            		if   (runner == 3){score++; }
            		else              {runner++;}
           		}
            	if(s.equals("OUT")){out++;}
            	if(s.equals("HOMERUN")){
            		score += runner + 1;
            		runner = 0;
            	}
        	}
        	System.out.println(score);
        }
	}
}