import java.util.*;

public class Main {

	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] lines = line.split(" ", 0);
    	int numSeason = Integer.parseInt(lines[0]);
    	int period = Integer.parseInt(lines[1]);
    	
		line = sc.nextLine();
		lines = line.split(" ", 0);
		int[] testResultList = new int[numSeason];
      	
      	for (int i = 0; i < numSeason; i++) {
      	    testResultList[i] = Integer.parseInt(lines[i]);
      	}
      	
      	for (int i = 0; i < numSeason - period; i++) {
      	    if (testResultList[i] < testResultList[i + period]) {
      	        System.out.println("Yes");
      	    } else {
      	        System.out.println("No");
      	    }
      	}
	}
}
