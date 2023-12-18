import java.util.*;
public class Main {

	public static void main(String[] args) {
	Scanner cin = new Scanner(System.in);
	int n,tp=0,hp=0;
	String t,h;
	n=cin.nextInt();
	for(int i=0;i<n;i++){
		int x=0;
		t=cin.next();
		h=cin.next();
		x=t.compareTo(h);
		if(x==0){
			tp=tp+1;
			hp=hp+1;
		}
		else if(x>0){
			tp=tp+3;
		}
		else if(x<0){
			hp=hp+3;
		}
	}
	System.out.println(tp+" "+hp);
	}

}