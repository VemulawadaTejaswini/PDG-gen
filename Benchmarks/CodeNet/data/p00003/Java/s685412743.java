import java.io.*;


public class Test {
	public static void main(String[] args)  throws IOException
	{
	    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	    int N = Integer.parseInt(buf.readLine());
	    String[] list;
	    String[] check = new String[N];
	    int i,j,l;
	    for(int k=0; k<N; k++){
	        list = buf.readLine().split(" ");
	        i = Integer.parseInt(list[0]);
	        j = Integer.parseInt(list[1]);
	        l = Integer.parseInt(list[2]);
	        check[k] = Check(i,j,l);
	    }
	    for(int k = 0; k<N-1; k++){
	    	System.out.println(check[k]);
	    }
	    int n = N-1;
	    System.out.print(check[n]);
	    
	}
	
	public static String Check(int a,int b,int c){
		if(a-b >0 && a-c>0){
			if(a*a == b*b + c*c){
				return"Yes";
			}else{
				return "No";
			}
		}else if(b-a >0 && b-c>0){
			if(b*b == a*a + c*c){
				return "Yes";
			}else{
				return "No";
			}
		}else{
			if(c*c == b*b + a*a){
				return "Yes";
			}else{
				return "No";
			}
		}
	}
		
}