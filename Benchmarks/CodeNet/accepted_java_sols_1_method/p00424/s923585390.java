import java.util.*;

public class Main{
    Main(){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){
	    int n = sc.nextInt();
	    if(n == 0) break;
	    HashMap<String, String> map= new HashMap<String, String>();
	    for(int i = 0; i < n; i++)
		map.put(sc.next(), sc.next());

	    n = sc.nextInt();
	    for(int i = 0; i < n; i++){
		String str = sc.next();
		if(map.containsKey(str)) str = map.get(str);
		System.out.print(str);
	    }
	    System.out.println();
	}
    }

    public static void main(String[] args){
	new Main();
    }
}