import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
	
    public static void main(String[] a){
    	
		//get number of data sets
		Scanner in = new Scanner(System.in);
		try{
			int numDS = in.nextInt();
			int aSide = 0;
			int bSide = 0;
			int cSide = 0;
			
			//check data set
			String[] results = new String[numDS];
			
			in = new Scanner(System.in);
			int i = 0;
			
			while (i < numDS){
				String ds = in.nextLine();
				
				String[] sides = ds.split(" ");
				if(sides.length == 3){
					
					try {
						int temp1 = Integer.parseInt(sides[0]);
						int temp2 = Integer.parseInt(sides[1]);
						int temp3 = Integer.parseInt(sides[2]);
						
						if (temp1 <= 0 || temp1 >1000 ||
							temp2 <= 0 || temp2 >1000 ||
							temp3 <= 0 || temp3 >1000){
							results[i] = "NO";
						} else {
							//get the highest number and place to cSide
							if (temp1 > temp2 && temp1> temp3){
								cSide = temp1;
								aSide = temp2;
								bSide = temp3;
							} else if (temp2 > temp1 && temp2 > temp3){
								cSide = temp2;
								aSide = temp1;
								bSide = temp3;
							} else {
								cSide = temp3;
								aSide = temp2;
								bSide = temp1;
							}
							
							//Pythagorean
							if ((cSide*cSide) == ((aSide*aSide)+(bSide*bSide))){
								results[i] = "YES";
							} else {
								results[i] = "NO";
							}
						}
					} catch (NumberFormatException e){
						results[i] = "NO";
					}
				} else {
					results[i] = "NO";	
				}
				
				i++;
			}
			
			//print result
			for (int j = 0; j < numDS; j++){
				System.out.println(results[j]);
			}
			
		} catch (InputMismatchException e){
		}
    }
}