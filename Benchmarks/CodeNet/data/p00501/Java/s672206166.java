import java.util.*;

class Main{

    void solve(){
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	char[] shop = sc.next().toCharArray();

	String[] list = new String[n];
	boolean[] boo = new boolean[n];

	for(int i=0; i<n; i++) list[i] = sc.next();

	int cnt = 0;
	for(int i=0; i<50; i++){//wide
	    for(int k=0; k<n; k++){//furui
		if(boo[k]) continue;
		char[] c = list[k].toCharArray();
		for(int l=0; l<c.length; l++){//start
		    for(int j=0; j<shop.length; j++){//shop
			int idx = i * j + j + l;
			if(idx>=c.length) break;
			if(c[idx]!=shop[j]) break;
			if(j==shop.length-1) boo[k] = true;
		    }
		    if(boo[k]) break;
		}
	    }
	}

	for(int i=0; i<boo.length; i++){
	    if(boo[i]) cnt++;
	}

	System.out.println(cnt);
    }

    public static void main(String[] args){
	new Main().solve();
    }
}