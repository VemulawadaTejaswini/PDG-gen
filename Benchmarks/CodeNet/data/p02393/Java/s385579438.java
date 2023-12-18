import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] ab=reader.readLine().split(" ");
        List<Integer> nums=new ArrayList<Integer>();
        for(int i=0;i<3;i++){
        	nums.add(Integer.parseInt(ab[i]));
        }
        Collections.sort(nums);
        for(int i=0;i<3;i++){
        	System.out.print(nums.get(i));
        	System.out.print(" ");
        }
    	System.out.println();
	}
}