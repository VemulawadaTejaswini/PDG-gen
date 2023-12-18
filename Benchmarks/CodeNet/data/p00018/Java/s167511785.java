import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main
{
    public static void main(String[] args) throws IOException
    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> num = new ArrayList<Integer>();
		int count = 5;
		while(count>0){
			String s = br.readLine();
			num.add(Integer.parseInt(s));
			count--;
		}
		Collections.sort(num);
		for(int i=4; i>-1; i--) System.out.println(num.get(i));
    }
}