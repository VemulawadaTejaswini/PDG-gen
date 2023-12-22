import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(true){
        	String in=br.readLine();
			if(in.equals("0 0")) break;
            String[] a=in.split(" ");
            int n=Integer.parseInt(a[0]);
            int x=Integer.parseInt(a[1]);
            List<String> l=new ArrayList<String>(); 
        	for(int i=1;i<=n;i++){
            	for(int j=1;j<=n;j++){
                	for(int k=1;k<=n;k++){
                		if(i!=j&&j!=k&&k!=i&&i+j+k==x){
                			int[] q={i, j, k};
                			Arrays.sort(q);
                			String s=Arrays.toString(q);
                			if(l.indexOf(s)==-1) l.add(s);
                		}
                	}
            	}
        	}
        	System.out.println(l.size());
        }
	}
}