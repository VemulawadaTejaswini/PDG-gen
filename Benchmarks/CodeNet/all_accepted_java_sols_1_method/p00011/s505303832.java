import java.io.BufferedReader;
import java.io.InputStreamReader;
class Main{
    public static void main(String args[]){
	try{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String str;
	    String strary[] = new String[2];
	    int w = Integer.parseInt(br.readLine());
	    int n = Integer.parseInt(br.readLine());
	    int ary[] = new int[w];
	    for (int i = 0; i < w; i++) {
		ary[i] = i+1;
	    }
	    int a,b,tmp;
	    for (int i = 0; i < n; i++) {
		str = br.readLine();
		strary = str.split(",");
		a = Integer.parseInt(strary[0]);
		b = Integer.parseInt(strary[1]);
		tmp = ary[a-1];
		ary[a-1] = ary[b-1];
		ary[b-1] = tmp;
	    }
	    for (int i = 0; i < w; i++) {
		System.out.println(ary[i]);
	    }
	}
	catch(Exception e){
	    System.out.println("error");
	    System.exit(0);
	}
    }
}