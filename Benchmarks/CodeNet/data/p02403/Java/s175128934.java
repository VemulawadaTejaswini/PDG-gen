import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> x = new ArrayList<Integer>();
        ArrayList<Integer> y = new ArrayList<Integer>();
         
        int H,W;
         
        while(true){
            H = sc.nextInt();
            W = sc.nextInt();
             
            if(H == 0 && W == 0)
                break;
             
            x.add(H);
            y.add(W);
             
        }
        
        int countH = 0;
        int countW = 0;

        for(countH = 0; countH < x.size(); countH++){
        	
        	for(int i = 0; i < x.get(countH); i++)
            {
            	for(int t = 0; t < y.get(countW); t++)
            	{
            		if(t < y.get(countW) -1)
            		{
            			System.out.print("#");
            		}
            		else if(t == y.get(countW) -1)
            		{
            			System.out.println("#");
            		}
            	}
            }
        	
        	System.out.println("");
        	countW++;
        }

		
		
		
	}

}