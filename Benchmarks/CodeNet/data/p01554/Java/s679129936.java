import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	while(kbd.hasNext()){
	    int n = kbd.nextInt();
	    if(n!=0){
		int i;
		boolean key = false; //falseなら施錠されている
		String[] id = new String[n];
		for(i=0; i<n; i++){
		    id[i] = kbd.next();
		}
		int m = kbd.nextInt();
		while(m>0){
		    String x = kbd.next();
		    boolean c = false; //trueなら正しいID
		    for(i=0; i<n; i++){
			if(x.equals(id[i])) {
			    c = true; break;
			}
		    }
		    
		    if(c){
			if(!key){
			    System.out.println("Opened by "+x);
			    key = true;
			}
			else{
			    System.out.println("Closed by "+x);
			    key = false;
			}
		    }
		    else{
			System.out.println("Unknown "+x);
		    }
		    m--;
		}
	    }
	}
    }
}