import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
        while(true){
        	String in=br.readLine();
			if(in.equals("0 0")) break;
            String[] a=in.split(" ");
            int n=Integer.parseInt(a[0]);
            int x=Integer.parseInt(a[1]);
            int count=0;
        	for(int i=n;i>0;i--){
            	for(int j=i-1;j>0;j--){
            		int k=x-i-j;
            		if(k<=n && k!=i && k!=j && 0<k && k<j){
            			count++;
            		}
            	}
        	}
        	sb.append(count+"\n");
        }
    	System.out.print(sb);
	}
}