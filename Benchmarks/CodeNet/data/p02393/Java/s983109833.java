import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new  Scanner(System.in);
		String line = scanner.nextLine();
		//scanner.close();	
		String array[] = line.split(" ");
		int a = Integer.parseInt(array[0]);
		int b = Integer.parseInt(array[1]);
		int c = Integer.parseInt(array[2]);
			
		// ??\?????????1??\???10000??\???
	    if ( (a>=1)&&(a<=10000) && (b>=1)&&(b<=10000) && (c>=1)&&(c<=10000) ) {
	    	int[] numArray = new int[3];
			numArray[0] = a;
			numArray[1] = b;
			numArray[2] = c;	
			Arrays.sort(numArray);
			
			for (int i=0; i<numArray.length; i++) {
				System.out.print(numArray[i] + " ");
			}	
		}
	}
}