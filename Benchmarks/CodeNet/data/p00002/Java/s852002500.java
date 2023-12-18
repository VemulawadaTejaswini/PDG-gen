import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AOJ_0002 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader buf= new BufferedReader(new InputStreamReader(System.in));
		List<Integer> a=new ArrayList<Integer>(200);
		List<Integer> b=new ArrayList<Integer>(200);
		String str=null;
		int count=0;
		
		while(str!=null){
			count++;
			str=buf.readLine();
			 a.add(Integer.parseInt(str.split(" ")[0]));
			 b.add(Integer.parseInt(str.split(" ")[1]));
		}
		
		for(int i=0; i<count ;i++){
			System.out.println(a.get(i)+b.get(i));
			
		}
	}
}