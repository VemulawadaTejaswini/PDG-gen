import java.io.*;
class Main{
    public static void main(String args[]) throws IOException{
	int j=0,x=0,l=1;
	int[] arry = new int[1000];
	for(;;)
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String str = br.readLine();
	    j=Integer.parseInt(str);
	    if(j==0)break;
	    arry[l]=j;
	    l++;
	}
	for(int i=1;i<l;i++){
	    x=arry[i];
	    System.out.println("Case "+ i +": "+x);
	}
	return 0;
    }
}