import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    StringBuffer ans;
    String[] num = {"", "", "k", "s", "t", "n", "h", "m", "y", "r"};
    String[] b = {"a", "i", "u", "e", "o"};
    char[] st;

    void run(){
	while(sc.hasNext()){
	    st = sc.next().toCharArray();
	    ans = new StringBuffer();
	    solve();
	}
    }

    void solve(){
	int i=0;
	while(i<st.length){
	    char x = st[i++];
	    char y = st[i++];
	    ans.append(getChar(x, y));
	}
	System.out.println(ans.toString());
    }

    String getChar(char x, char y){
	if(x!=0){
	    return (String)num[x-'0']+b[getB(y)];
	}
	else{
	    if(y=='T') return "wa";
	    else if(y=='D') return "wo";
	    else return "nn";
	}
    }

    int getB(char y){
	if(y=='T') return 0;
	else if(y=='L') return 1;
	else if(y=='U') return 2;
	else if(y=='R') return 3;
	else return 4;
    }
}