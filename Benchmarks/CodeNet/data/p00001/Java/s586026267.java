import java.io.*;
class Main{
    public static void main (String[] args)
   	throws IOException{
	int[] data=new int[10];
	int max1,max2,max3;
       BufferedReader br=
	   new BufferedReader(new InputStreamReader(System.in));
	for(int i=0;i<10;i++){
	    String buf=br.readLine();
	    data[i]=Integer.parseInt(buf);
	}
	java.util.Arrays.sort(data);
	for(int i=9;i=>7;i--){
	    System.out.println(data[i]);
	}
	
    }
}
	    