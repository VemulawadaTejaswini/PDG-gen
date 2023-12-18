import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = line.indexOf("N")<0 ? 1 : 0;
		int S = line.indexOf("S")<0 ? 1 : 0;
		int W = line.indexOf("W")<0 ? 1 : 0;
		int E = line.indexOf("E")<0 ? 1 : 0;
		boolean ns = false;
		boolean we = false;

		if(N==S){
			ns = true;
		}
		if(W==E){
			we = true;
		}

		if(ns && we){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

}