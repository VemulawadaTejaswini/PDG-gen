import java.util.*;

class Main{

    char[] in;
    int p;



    void solve(){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){
	    String s = sc.next();

	    in = s.toCharArray();
	    int n = 0;
	    for(int i=0; i<in.length; i++){
		if(in[i]=='=') n = i;
	    }

	    int ans = -1;
	    for(int num = 0; num <= 9; num++){
		for(int i=0; i<in.length; i++){
		    if(s.charAt(i)=='X'){
			in[i] = (char)(num + '0');
		    }
		}
		p = 0;
		String left = alphametic();
		String right = digit();
		//System.out.println(left+" "+right);
		if(left.equals("-1") || right.equals("-1")) continue;
		if(left.equals(right)) ans = num;
	    }

	    if(ans==-1) System.out.println("NA");
	    else System.out.println(ans);
	}
    }

    String alphametic(){
	if(in[p]=='0') return "-1";
	String a = digit();
	p++;
	if(in[p]=='0') return "-1";
	String b = digit();
	p++;
	String res = sum(a, b);
	return sum(a, b);
    }

    String sum(String a, String b){
	int n1 = a.length();
	int n2 = b.length();
	if(n1<n2){
	    String tmp = a;
	    a = b;
	    b = tmp;
	}

	String[] line = new String[Math.max(a.length(), b.length())+1];
	for(int i=0; i<a.length(); i++) line[i] = String.valueOf(a.charAt(a.length()-i-1));
	for(int i=0; i<b.length(); i++){
	    int num = Integer.valueOf(line[i]);
	    int num2 = b.charAt(b.length()-i-1) - '0';
	    num += num2;
	    if(num<10) line[i] = String.valueOf(num);
	    else{
		line[i] = String.valueOf(num % 10);
		int num3 = 0;
		if(line[i+1]!=null) num3 = Integer.parseInt(line[i+1]);
		line[i+1] = String.valueOf(num3 + num/10);
	    }
	}

	String res = "";
	for(int i=line.length-1; i>=0; i--){
	    if(line[i]==null) continue;
	    res += line[i];
	}
	return res;
    }

    String digit(){
	if(in[p]=='0') return "-1";
	String res = "";
	while(p<in.length && Character.isDigit(in[p])) res += in[p++];
	return res;
    }

    public static void main(String[] args){
	new Main().solve();
    }
}