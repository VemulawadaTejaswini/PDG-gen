import java.io.*;
import java.util.*;

public class Main{
    public static void main(String argas[]) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	int n=Integer.parseInt(br.readLine());


	Map<String,Integer> map=new HashMap<>();
	
	for(int i=0;i<n;i++){
	    map.put(br.readLine(),0);
	}

	int m=Integer.parseInt(br.readLine());

	int count=0;
	for(int i=0;i<m;i++){
	    String s=br.readLine();

	    if(map.containsKey(s)){
		if(count%2==0){
		    System.out.println("Opened by "+s);
		}else{
		    System.out.println("Closed by "+s);
		}
	        count++;
	    }else{
		System.out.println("Unknown "+s);
	    }
	}
    }
}

