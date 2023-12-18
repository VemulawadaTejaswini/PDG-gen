import java.io.*;
import java.util.*;

public class Main{
	public static void main(String args[]){
		try{
			new Main();
		}catch(IOException err){
			err.printStackTrace();
		}
	}

	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		List<String> Ans = new ArrayList<String>();
		String line;

		while((line = in.readLine()) != null){
			if(line.equals("")) break;
			Ans.add(Alpha(line));
		}

		for(int i=0; i<Ans.size(); i++){
			System.out.println(Ans.get(i));
		}
	}

	public String Alpha(String line){
		List<String> eq = new ArrayList<String>();
		for(int i=0; i<line.length(); i++){
			eq.add(line.substring(i, i+1));
		}

		for(int x=0; x<=9; x++){
			if(isOK(x, eq)){
				return Integer.toString(x);
			}
		}

		return "NA";
	}

	public boolean isOK(int x, List<String> org){
		List<String> eq = new ArrayList<String>();
		for(int i=0; i<org.size(); i++){
			eq.add(org.get(i));
		}

		for(int i=0; i<eq.size(); i++){
			if(eq.get(i).equals("X")){
				eq.set(i, Integer.toString(x));
			}
		}

		for(int i=0; i<eq.size()-1; i++){
			if(isNumber(eq.get(i)) && isNumber(eq.get(i+1))){
				eq.set(i, eq.get(i) + eq.get(i+1));
				eq.remove(i+1);
				i--;
			}
		}

		int a = Integer.parseInt(eq.get(0));
		int b = Integer.parseInt(eq.get(2));
		int c = Integer.parseInt(eq.get(4));

		if(!Integer.toString(a).equals(eq.get(0)) || !Integer.toString(b).equals(eq.get(2)) || !Integer.toString(c).equals(eq.get(4))){
			return false;
		}

		if(a+b == c){
			return true;
		}

		else{
			return false;
		}
	}

	public boolean isNumber(String x){
		try{
			int n = Integer.parseInt(x);
		}catch(NumberFormatException err){
			return false;
		}

		return true;
	}
}