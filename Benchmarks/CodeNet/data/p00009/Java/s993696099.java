import java.io.BufferedReader;
import java.io.InputStreamReader;
class Main{
    public static void main(String args[]){
	try{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String str;
	    boolean s[] = new boolean[1000000];
	    int maxnum = 1000000;
	    int count = 0;
	    int sc[] = new int[1000000];
	    s[0] = false;//?´???°??§?????????
	    s[1] = false;
	    for (int i = 2; i < maxnum; i++) {
		s[i] = true;  //?´???°
	    }
	    for (int i = 1; i < maxnum; i++) {
		if(s[i] == true){
		    count++;
		    for (int j = i+i; j < maxnum; j+=i) {
			s[j]=false;
		    }
		}
		sc[i] = count;
	    }
	    while(null != (str = br.readLine())){
		int n = Integer.parseInt(str);
		System.out.println(sc[n]);
	    }
	}
	catch(Exception e){
	    System.exit(0);
	}
    }
}