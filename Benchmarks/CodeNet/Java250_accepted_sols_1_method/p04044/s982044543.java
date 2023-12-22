import java.util.*;
import java.io.*;
class Main{
	public static void main(String args[]){
    	Scanner in = new Scanner(System.in);
      	OutputStream outputstream = System.out;
      	//PrintWriter out = new PrintWriter(outputstream);
      	int N = in.nextInt();
      	int L = in.nextInt();
      	String[] s = new String[N];	
      	for(int i =0;i<N;i++){
          	s[i] = in.next();
        }
      	Arrays.sort(s);
      	String ans = "";
      	for(int i =0;i<N;i++){
        	ans+=s[i];
        }
      	System.out.println(ans);
    }
}