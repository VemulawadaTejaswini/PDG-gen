import java.util.*;
public class Main {
    static Scanner kbd = new Scanner(System.in);
    static HashMap<String, String>  con; 
    public static void main(String[] args){
	while(kbd.hasNext()){
	    int n = kbd.nextInt();
	    if(n!=0){
		con = new HashMap<String, String>(20);
		String in;
		String out;
		String ans = "";
		int i;

		for(i=0; i<n; i++){
		    in = kbd.next();
		    out = kbd.next();
		    con.put(in, out);
		}

		n = kbd.nextInt();
		for(; n>0; n--){
		    String a = kbd.next();
		    if(con.containsKey(a))  ans += con.get(a);
		    else ans += a;
		}
		System.out.println(ans);
	    }
	}
    }
}