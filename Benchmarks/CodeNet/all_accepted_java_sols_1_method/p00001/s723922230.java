import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		try {
			int i;
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			ArrayList<Integer> height = new ArrayList<Integer>();
			for(i=0;i<10;i++)height.add(Integer.parseInt(bf.readLine()));
			Collections.sort(height);
			Collections.reverse(height);
			for(i=0;i<3;i++)System.out.println(height.get(i));
		}catch(Exception e){
			System.out.println(e);
		}
	}
}