import java.util.*;

class Main{
    public static void main(String[] args){
    	Scanner sc= new Scanner(System.in);
    	String s; int ans=0; 
    	String w=sc.next();

for(;;){
	s=sc.next();if(s=="END_OF_TEXT") break;
	if(w==s) ans++;
}
System.out.println(ans);
    }
}