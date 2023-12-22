import java.io.*;
import java.util.*;

public class Main{
public static void main(String[] args){
	try{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String[] str = br.readLine().split(" ");
	List<Integer> num = new ArrayList<Integer>();
	
		for(int i = 0; i < str.length; i++){
		num.add(Integer.parseInt(str[i]));
		}
	
	Collections.sort(num);
	
		for(int n = 0; n < num.size(); n++){
			if(n != num.size()-1){
			System.out.print(num.get(n) + " ");
			}else{
			System.out.println(num.get(n));
			}
		}

	}catch(IOException e){
	System.out.println(e);
	}
}	
}