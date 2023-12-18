import java.util.*;
public class DataConversion0501 {
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	while(kbd.hasNext()){
	    int n = kbd.nextInt();
	    if(n!=0){
		String[] in = new String[n];
		String[] out = new String[n];
		String s = "";
		int i;

		for(i=0; i<n; i++){
		    in[i] = kbd.next();
		    out[i] = kbd.next();
		}

		n = kbd.nextInt();
		for(; n>0; n--){
		    String a = kbd.next();
		    for(i=0; !in[i].equals(a) && i+1<in.length; i++);
		    if(!in[i].equals(a))  s += a;
		    else s += out[i];
		}
		System.out.println(s);
	    }
	}
    }
}