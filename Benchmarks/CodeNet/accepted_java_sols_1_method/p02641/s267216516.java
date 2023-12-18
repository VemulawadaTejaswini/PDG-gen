import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main (String[] args) throws IOException{
	    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
	    BufferedReader in = new BufferedReader(reader);
	    String[] str1 = in.readLine().split(" ");
	    int num1 = Integer.parseInt(str1[0]);
	    int num2 = Integer.parseInt(str1[1]);

	    if(num2==0) {
			System.out.println(num1);
	    }else {
		    String[] str2 =in.readLine().split(" ");
		    List<Integer> arrays = new ArrayList<Integer>();
		    for(int i = 0; i<num2; i++) {
		    	arrays.add(Integer.parseInt(str2[i]));
		    }
			if(!arrays.contains(num1)) {
				System.out.println(num1);
			}else {
				for(int i=1; i<num2+1; i++) {
					if(num1>0) {
					}
					if(!arrays.contains(num1-i)) {
						System.out.println(num1-i);
						break;
					}else if(!arrays.contains(num1+i)) {
						System.out.println(num1+i);
						break;
					}
				}
			}
	    }
	}
}