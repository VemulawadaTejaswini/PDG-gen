import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
	final BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String str=br.readLine();
	int n=Integer.parseInt(str);
	String str2[] = br.readLine().split(" ");
	int a[]=new int[n];
	for(int i=0;i<n;i++) a[i]=Integer.parseInt(str2[i]);
	for(int i=n-1;i<=0;i--){
	    if(i==0)System.out.print(a[i]);
	    else System.out.print(a[i]+" ");
	}
	System.out.println("");
    }
}