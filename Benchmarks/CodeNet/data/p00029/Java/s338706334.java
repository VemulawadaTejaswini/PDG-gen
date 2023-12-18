import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	solve();
    }

    static void solve(){
	String[] w = new String[1000]; //単語保存
	int[] t = new int[1000];       //単語の回数
	String ml = "";               //最大の単語長を持つ単語
	int mt = 0;                    //最も多く出た単語の配列番号
	int a=0, i=0;
	while(kbd.hasNext()){
	    String s = kbd.next();
	    while(i<a && s.compareToIgnoreCase(w[i])!=0) i++;
	    if(i==a) {
		System.out.println(s);
		if(ml.length() < s.length()) ml = s;
		w[i] = s;
		t[i]++;
		if(t[mt] < t[i]) mt = i;
		a++;
	    }
	    else{
		t[i]++;
		if(t[mt] < t[i]) mt = i;
	    }
	    i=0;
	}
	System.out.println(w[mt]+" "+ml);
    }
}