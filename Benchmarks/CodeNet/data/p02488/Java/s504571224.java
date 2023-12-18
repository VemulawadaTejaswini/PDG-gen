import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main (String []args){
	
	Scanner sc = new Scanner(System.in);
	final int n = sc.nextInt();

	List<String> lst = new ArrayList<String>();
	for(int i=0;i<n - 1;++i){
	    String line = sc.nextLine();
	    if(line.equals("")) continue;
	    lst.add(line);
	}

	Collections.sort(lst);

	System.out.println(lst.get(0));
	
	sc.close();
    }
}