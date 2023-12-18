import java.util.Scanner;
import java.util.HashMap;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	HashMap<String, Integer> hash = new HashMap<String, Integer>();
	int N = scan.nextInt();

	for(int i = 0; i < N; i++){
	    String s = scan.next();
	    if(hash.containsKey(s)){
		hash.put(s, hash.get(s)+1);
	    }else{
		hash.put(s, 1);
	    }
	}

	int M = scan.nextInt();

	for(int i = 0; i < M; i++){
	    String s = scan.next();
	    if(hash.containsKey(s)){
		hash.put(s, hash.get(s)-1);
	    }else{
		hash.put(s, -1);
	    }
	}

	int max = 0;
	for(String s : hash.keySet()){
	    int num = hash.get(s);
	    if(max < num){
		max = num;
	    }
	}

	System.out.println(max);
    }
}
