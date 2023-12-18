import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

class Main{
	public static void main(String[] args) throws IOException{

	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

	ArrayList <Integer> list = new ArrayList <Integer> ();
	String str;

	while(!(str = input.readLine()).equals("0")){

		list.add(Integer.parseInt(str));

		}

		for(int i = 0 ; i < list.size() ; i++){

		System.out.println("Case " + (i+1) + ": " + list.get(i));
		}
	}
}