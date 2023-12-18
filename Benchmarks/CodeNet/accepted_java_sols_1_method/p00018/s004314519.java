import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) throws IOException {
		String outStr = "";
		List<Integer> NumberList = new ArrayList<Integer>();
        String numbers = new BufferedReader(new InputStreamReader(System.in)).readLine();
        String[] NumberArray = numbers.split(" ");
        
        for(int i = 0; i < NumberArray.length; i++){
        	NumberList.add(Integer.parseInt(NumberArray[i]));
        }
        
        Collections.sort(NumberList);
        Collections.reverse(NumberList);
        
        Iterator numberIterate = NumberList.iterator();
        while(numberIterate.hasNext()){
        	outStr = outStr + numberIterate.next() + " ";
        }
        
        System.out.println(outStr.trim());
	}

}