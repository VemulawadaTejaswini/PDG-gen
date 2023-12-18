import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		Scanner stdIn = null;
		List<int[]> data = new ArrayList<int[]>();
		
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			while( stdIn.hasNext() ){
				String str = stdIn.next();
				String[] s = str.split(",");
				int[] temp = new int[2];
				temp[0] = Integer.parseInt(s[0]);
				temp[1] = Integer.parseInt(s[1]);
				data.add(temp);
			}
			int sum = 0;
			int num = 0;
			for(int[] a : data){
				sum += a[0]*a[1];
				num += a[1];
			}
			double ave = (double)num/data.size();
			System.out.printf("%d %.0f%n", sum, ave);
		} finally {
			if( stdIn != null ){
				stdIn.close();
			}
		}
	}
}