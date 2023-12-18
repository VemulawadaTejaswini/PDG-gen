import java.io.*;
class Main{
    public static void main(String args[]) throws IOException{
	int j=0,x=0,l=0;
	int[] arry = new int[1000];

	for(;;)
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String str = br.readLine();
	    x=Integer.parseInt(str);
	    if(x==0)break;
	    arry[l]=x;
	    l++;
	}
	for(int i=0;i<l;i++){
	    x=arry[i];
	    System.out.println("Case "+ (i+1) +": "+x);
	}
    }
}