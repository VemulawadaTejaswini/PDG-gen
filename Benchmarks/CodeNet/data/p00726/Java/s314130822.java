import java.util.*;

class Main{

    String S;
    int I;
    ArrayList<Character> line;
    boolean end;

    void solve(){
	Scanner sc = new Scanner(System.in);

	while(true){
	    S = sc.next();
	    I = sc.nextInt();
	    if(S.equals("0") && I==0)break;

	    line = new ArrayList<Character>();
	    end = false;
	    splitLine(S);

	    String ans = "";
	    if(I>=line.size())ans = "0";
	    else ans = String.valueOf(line.get(I));

	    System.out.println(ans);
	}
    }

    void splitLine(String s){
	if(end)return;

	for(int i=0; i<s.length(); i++){
	    if(s.charAt(i)-'A'<=25 && s.charAt(i)-'A'>=0){
		int j = i+1;
		for(j=i+1; j<s.length(); j++){
		    if(!(s.charAt(j)-'A'<=25 && s.charAt(j)-'A'>=0))break;
		}
		addLine(s.substring(i,j));
		if(end)return;
		i = j-1;
		
	    }else{
		int from = i;
		for(from=i+1; from<s.length(); from++){
		    //if(!(s.charAt(from)<10 || s.charAt(from)=='0'))break;
		    char c = s.charAt(from);
		    if(!(c=='0' || c=='1' || c=='2' || c=='3' || c=='4' || c=='5' || c=='6' || c=='7' || c=='8' || c=='9'))break;
		}
		int N = Integer.parseInt(s.substring(i,from));

		int pair = 0;
		int to=from;
		for(to=from; to<s.length(); to++){
		    if(s.charAt(to)=='(') pair++;
		    if(s.charAt(to)==')') pair--;
		    if(pair==0)break;
		}
		
		String seq = "";
		if(from==to){
		    seq = s.substring(from,from+1);
		}else{
		    seq = s.substring(from+1,to);
		}
		
		while(N-->0)splitLine(seq);
		i = to;
	    }
	}
    }
    
    void addLine(String s){
	char[] c = s.toCharArray();
	for(int i=0; i<c.length; i++){
	    line.add(c[i]);
	    if(line.size()>I){end = true; return;}
	}
    }

    public static void main(String[] args){
	new Main().solve();
    }
}