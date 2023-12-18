import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    void run(){
	while(sc.hasNext()){
	    String s = sc.nextLine();
	    char[] c = s.toCharArray();
	    int x = 'A' - 'a';
	    String ans = "";
	    for(int i=0; i<c.length; i++){
		if(c[i]-'a'>=0 && c[i]-'z'<=0)
		    c[i] = (char)(c[i]+x);
		ans += Character.toString(c[i]);
	    }
	    System.out.println(ans);
	}
    }
}
	 