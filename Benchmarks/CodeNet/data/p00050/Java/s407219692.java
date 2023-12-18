import java.util.*;
public class Main{
    Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	new Main().run();
    }

    void run(){
	while(kbd.hasNext()){
	    String x;          // 取得1文字
	    StringBuffer sent = new StringBuffer();  // 出力文章
	    String in = kbd.nextLine(); // 入力文章
	    
	    int i;
	    for(i=0; i<in.length(); i++){
		x = in.substring(i, i+1);
		if(x.equals("a") || x.equals("p")){
		    for(int k=0; k<4; k++){
			i++;
			x += in.substring(i, i+1);
		    }
		    if(x.compareToIgnoreCase("apple") == 0){
			char[] c = x.toCharArray();
			sent.append( change(c, 1) );
		    }
		    else if(x.compareToIgnoreCase("peach") == 0){
			char[] c = x.toCharArray();
			sent.append( change(c, 2) );
		    }
		    else sent.append(x);
		}
		else sent.append(x);
	    }
		
	    System.out.println(sent);
	}
    }

    String change(char[] c, int d){
	int[] m = {'p'-'a', 'e'-'p', 'a'-'p', 'c'-'l', 'h'-'e'};
	// apple と peach の差
	String ans = "";
	for(int i=0; i<c.length; i++){
	    if(d==1){
		ans += (char)(c[i]+m[i]);
	    }
	    else if(d==2){
		ans += (char)(c[i]-m[i]);
	    }
	}
	if(ans.equals(""))
	    return "***";
	return ans;
    }
}