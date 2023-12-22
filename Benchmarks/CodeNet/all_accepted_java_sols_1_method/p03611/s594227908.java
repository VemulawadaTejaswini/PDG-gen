import java.util.*;

public class Main {
	public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
      	int count  = Integer.valueOf(sc.nextLine());
      	String input = sc.nextLine();
      	String inputs[] = input.split(" ");
      	int poss[] = new int[100002];
      	for( int i= 0 ; i<count; i++) 
        {
          	int value = Integer.valueOf(inputs[i]);
          	value++;
            poss[value]+=1;
          	poss[value-1]+=1;
          	poss[value+1]+=1;
        }
      	 int max  =Integer.MIN_VALUE;
      	for( int i = 0 ; i<100002 ; i++) 
        {
          //System.out.println("i: "+poss[i]);
         	if(poss[i]>=max)
            {
              	max = poss[i];
            }
        }
      	System.out.println("\n"+max);
      
    }
}