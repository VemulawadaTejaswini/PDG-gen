import java.util.*;

public class Main{
    char conv(char ch, int d){
	return (char)('a'+(int)(ch-'a'+d)%26);
    }

    Main(){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){
	    int n = sc.nextInt();
	    if(n == 0) break;
	    int[] a = new int[n+1];
	    int[] b = new int[n+1];
	    char[] ch = (sc.next()).toCharArray();

	    for(int i = n-1; i >= 0; --i){
		a[i] = sc.nextInt();
		b[i] = sc.nextInt();
		a[i]--; b[i]--;
	    }

	    for(int i = 0; i < n; ++i){
		ch[a[i]] = conv(ch[a[i]], b[i]-a[i]);
		ch[b[i]] = conv(ch[b[i]], b[i]-a[i]);
		char tmp = ch[a[i]];
		ch[a[i]] = ch[b[i]];
		ch[b[i]] = tmp;
	    }

	    System.out.println(String.valueOf(ch));
	}
    }

    public static void main(String[] args){
	new Main();
    }
}