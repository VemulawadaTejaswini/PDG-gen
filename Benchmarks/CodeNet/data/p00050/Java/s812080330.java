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
		    if(x.equals("apple")){
			sent.append("peach");
		    }
		    else if(x.equals("peach")){
			sent.append("apple");
		    }
		    else sent.append(x);
		}
		else sent.append(x);
	    }
		
	    System.out.println(sent);
	}
    }
}