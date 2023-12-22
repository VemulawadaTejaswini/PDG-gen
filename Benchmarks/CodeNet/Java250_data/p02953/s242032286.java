import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;
/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
	public static void main(String[] args) {
		InputReader in = new InputReader(System.in);
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)),true);
		TaskB solver = new TaskB();
		solver.solve(1, in, out);
		out.flush();
		out.close();
	}
}

class TaskB {
    public void solve(int testNumber, InputReader in, PrintWriter pw) {
    	int n=in.nextInt();
    	int arr[]=new int[n];
    	for(int i=0;i<n;i++) {
    		arr[i]=in.nextInt();
    	}
    	boolean flag=true;
    	int temp=arr[0];
    	int max=arr[0];
    	for(int i=1;i<n;i++) {
    		if(arr[i]<temp-1||arr[i]<max) {
    			flag=false;
    			break;
    		}
    		max=temp-1>max?temp-1:max;
    		temp=arr[i];
    	}
    	if(flag) {
    		pw.println("Yes");
    	}else {
    		pw.println("No");
    	}
    	
    		
    	}
}
class Pair<A,B>{
	A first;
	B second;
	Pair(A first,B second){
		this.first=first;
		this.second=second;
	}
}


class InputReader{
    BufferedReader br;
    StringTokenizer st;
    public InputReader(InputStream in){
        br=new BufferedReader(new InputStreamReader(in));
        st=null;
    }
    public String next(){
    while(st==null||!st.hasMoreTokens()){
        try{
            st=new StringTokenizer(br.readLine());
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }
   return st.nextToken();
    }
    public int nextInt(){
        return Integer.parseInt(next());
    }
    public long nextLong() {
    	return Long.parseLong(next());
    }
}
