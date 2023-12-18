import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
	int []data=new int[5];
	BufferedReader br=
	    new BufferedReader(new InputStreamReader(System.in));
	String[] buf=br.readLine().split(" ");
	for(int i=0;i<5;i++){
	    data[i]=Integer.parseInt(buf[i]);
	}
	java.util.Arrays.sort(data);
	for(int i=4;i>=0;i--){
	    System.out.print(data[i]);
	    if(i!=0)
		System.out.print(" ");
	    else
		System.out.println();
	}
    }
}