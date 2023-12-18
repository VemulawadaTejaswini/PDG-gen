import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	String t = sc.next();
	int[] pin = new int[s.length()];

	if(s.contains(t)) System.out.println(0);
	else {
	    for(int i=0; i<t.length(); i++){
		for(int i2=i; i2<s.length()-t.length()+i+1; i2++){
		    t=t+" ";
		    s=s+" ";
		    if(s.substring(i2,i2+1).equals(t.substring(i, i+1)))pin[i2-i]++;
		    t=t.trim();
		    s=s.trim();
		}		
	    }
	    int max=0;
	    for(int i=0; i<s.length(); i++){
		if(pin[i]>max){
		    max=pin[i];
		}
	    }		
	    System.out.println(t.length()-max);
	}
    }
}
