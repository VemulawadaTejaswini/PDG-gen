package app;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String line;
		ArrayList<String> tmp = new ArrayList<String>();
		while (buffer.ready()){
			line=buffer.readLine();
			tmp.add(line);
		}
		System.out.println(tmp.get(0));
		int[] num = splitter(tmp.get(0));
		if(num[0]>num[1]){
			System.out.println("a > b");
		}else if(num[0] < num[1]){
			System.out.println("a < b");
		}else
			System.out.println("a == b");
			


	}
	static int[] splitter(String str){
		String[] tmp = str.split(" " );
		int[] res = new int[tmp.length];
		for(int i=0; i<tmp.length; i++){
			res[i] = Integer.parseInt(tmp[i]);
			System.out.println(res[i]);
		}
			
		return res;
	}

}