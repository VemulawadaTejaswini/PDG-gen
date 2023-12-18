import java.util.Scanner;

public class Main{
    Main(){
	Scanner sc = new Scanner(System.in);
	int c = 0;

	while(sc.hasNext()){
	    String str = (sc.nextLine()).replace(',',' ');
	    str = str.replace('.',' ').replace('"', ' ').replace('\'', ' ');
	    str = str.replace(':', ' ');
	    String[] st = str.split(" ");
	    str = "";
	    for(int i = 0; i < st.length; i++){
		str += st[i].toUpperCase();
	    }
	    char[] ch = str.toCharArray();
	    st = new String[1024];
	    int t = 0, p, q;
	    for(int i = 1; i < str.length(); i++){
		for(p = i-1, q = i+1; p >= 0 && q < str.length(); p--, q++){
		    if(ch[p] != ch[q]){
			break;
		    }
		}
		p++;
		q--;
		if(q != p){
		    String str2 = "";
		    for(int j = p; j <= q; j++){
			str2 += ch[j];
		    }

		    int r = q-i, f = 0, d;
		    for(int j = 0; j < t; j++){
			String str3 = st[j];
			int l = str3.length();
			if(l%2 == 0){
			    continue;
			}
			if(l > q-p+1){
			    d = l/2;
			    if(d+r+1 < str3.length() && str2.equals(str3.substring(d-r, d+r+1))){
				f = 2;
				break;
			    } else if(d-r-1 >= 0 && str2.equals(str3.substring(d-r-1, d+r))){
				f = 2;
				break;
			    }
			} else if(l == q-p+1){
			    if(str3.equals(str2)){
				f = 2;
				break;
			    }
			} else {
			    d = str2.length()/2;
			    if(d+l/2+1 < str2.length() && str3.equals(str2.substring(d-l/2, d+l/2+1))){
				f = 1;
				r = j;
				break;
			    } else if(d-l/2-1 >= 0 && str3.equals(str2.substring(d-l/2-1, d+l/2))){
				f = 1;
				r = j;
				break;
			    }
			}
		    }
		    if(f == 0){
			st[t++] = str2;
		    } else if(f == 1){
			st[r] = str2;
		    }
		}
		for(p = i-1, q = i; p >= 0 && q < str.length(); p--, q++){
		    if(ch[p] != ch[q]){
			break;
		    }
		}
		p++;
		q--;
		if(ch[q] == ch[p]){
		    String str2 = "";
		    for(int j = p; j <= q; j++){
			str2 += ch[j];
		    }

		    int r = (q-p+1)/2, f = 0, d;
		    for(int j = 0; j < t; j++){
			String str3 = st[j];
			int l = str3.length();
			if(l%2 == 1){
			    continue;
			}
			if(l > q-p+1){
			    d = l/2;
			    if(str2.equals(str3.substring(d-r, d+r))){
				f = 2;
				break;
			    }  
			} else if(l == q-p+1){
			    if(str3.equals(str2)){
				f = 2;
				break;
			    }
			} else {
			    d = str2.length()/2;
			    if(str3.equals(str2.substring(d-l/2, d+l/2))){
				f = 1;
				r = j;
				break;
			    }
			}
		    }
		    if(f == 0){
			st[t++] = str2;
		    } else if(f == 1){
			st[r] = str2;
		    }
		    
		}
	    }
	    
	    for(int i = t-1; i >= 0; i--){
		for(int j = 1; j <= i; j++){
		    if(st[j-1].length() < st[j].length()){
			str = st[j-1];
			st[j-1] = st[j];
			st[j] = str;
		    } else if(st[j-1].length() == st[j].length() && st[j-1].compareTo(st[j]) < 0){
			str = st[j-1];
			st[j-1] = st[j];
			st[j] = str;
		    }
		}
	    }
	    
	    if(t > 0){
		System.out.print(st[0]);
		for(int i = 1; i < t; i++){
		    System.out.print(" "+st[i]);
		}
	    }
	    System.out.println();
	}
    }

    public static void main(String[] args){
	new Main();
    }
}