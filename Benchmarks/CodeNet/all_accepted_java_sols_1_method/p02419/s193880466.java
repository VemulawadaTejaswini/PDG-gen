import java.util.*;

class Main{
    public static void main(String[] args){
    	Scanner sc= new Scanner(System.in);
    	String s,w;int ans=0; 
    	w=sc.nextLine().toLowerCase();
    	for(;;){
    		s=sc.next();if(s.equals("END_OF_TEXT")) break; 
    		s=s.toLowerCase();
    		if(w.equals(s)) ans++;
}
System.out.println(ans);
    }
}