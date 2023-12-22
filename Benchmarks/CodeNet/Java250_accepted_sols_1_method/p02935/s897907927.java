import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

    	Scanner       scan         = new Scanner(System.in);
    	List<Integer> inputNumbers = new ArrayList<Integer>();
    	double        ave          = 0;

    	int count = scan.nextInt();

    	for(int i=0; i<count; i++) {

    		inputNumbers.add(scan.nextInt());

    	}

    	scan.close();

    	Collections.sort(inputNumbers);
    	ave = inputNumbers.get(0);

    	for(int i=1; i<inputNumbers.size(); i++) {

    		ave = (ave + inputNumbers.get(i)) / 2;

    	}

    	System.out.println(ave);

	}

}