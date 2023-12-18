import java.util.*;
public class Main {
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	while(kbd.hasNext()){
	    String n = kbd.next();
	    if(n.length()!=0){
		String[] c = new String[n.length()];
		int i;
		int count = 0;
		for(i=0; i<n.length(); i++){
		    c[i] = n.substring(i, i+1);
		    //System.out.println(c[i]);
		}
		//System.out.println();
		if(c.length%2 == 1) {
		    if(c[c.length/2].equals("(") || c[c.length/2].equals(")")) {
			count++;	
			// System.out.println("a");
		    }
		}

		for(i=0; i<c.length/2; i++){
		    if(!check(c[i], c[c.length-i-1])) {
			count++;
			//System.out.println("b"+i);
		    }
		}

		System.out.println(count);
	    }
	}
    }

    static boolean check(String a, String b){
	if(a.equals("(")){
	    if(!b.equals(")")) return false;   
	}
	else if(a.equals(")")){ 
	    if(!b.equals("(")) return false;   
	}
	else{
	    if(!a.equals(b)) return false;
	}
	return true;
    }
}