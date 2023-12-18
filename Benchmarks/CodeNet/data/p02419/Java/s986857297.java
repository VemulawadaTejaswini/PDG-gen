import java.util.*;

class Main{
    public static void main(String[] args){
    	Scanner sc= new Scanner(System.in);
    	String s,w;int ans=0; 
    	w=sc.nextLine().toUpperCase();
    	while(sc.hasNext()){
    		s=sc.next().toUpperCase(); 
    		if(w==s) ans++;
}
System.out.println(ans);
    }
}