import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> height = new ArrayList<Integer>();
        ArrayList<Integer> width = new ArrayList<Integer>();
         
        int H,W;
         
        while(true){
            H = sc.nextInt();
            W = sc.nextInt();
             
            if(H == 0 && W == 0)
                break;
             
            height.add(H);
            width.add(W);
             
        }
        
        int countH = 0;
        int countW = 0;

        for(countH = 0; countH < height.size(); countH++){
        	
        	for(int i = 0; i < height.get(countH); i++)
            {
            	for(int t = 0; t < width.get(countW); t++)
            	{
            		if(t < width.get(countW) -1)
            		{
            			if(0 < t && 0 < i && i < height.get(countH) - 1){
            				System.out.print(".");
            			}
            			else{
            				System.out.print("#");
            			}
            		}
            		else if(t == width.get(countW) -1)
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