import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        ArrayList<String> list = new ArrayList<String>();
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
        	str = br.readLine();
        	list.add(str);
        }
        
        Collections.sort(list);
        System.out.println(list.get(0));
	}
}