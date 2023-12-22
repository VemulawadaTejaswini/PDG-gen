import java.io.*;
class Main{
public  static void main(String[] args){
	String[] x = new String[10];
	int[] mountain=new int[10];
	try{
	InputStreamReader is =new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(is);
     	for(int i=0;i<10;i++)
	    x[i]=br.readLine();
	}catch(IOException e){
	    System.out.println(e.getMessage());

	}
	for(int i=0;i<10;i++)
	    mountain[i]=Integer.parseInt(x[i]);
	for(int i=0;i<10;i++)
	    for(int j=1;j<10;j++)
		if(mountain[j]<mountain[j-1]){
		    int t=mountain[j];
		    mountain[j]=mountain[j-1];
		    mountain[j-1]=t;
		}

	for(int i=9;i>6;i--)
	    System.out.println(mountain[i]);
    }
}