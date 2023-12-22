import java.io.*;
class Main{
    public static void main(String args[])throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int i,j,k,h[]=new int[10];
	for(i=0;i<10;i++)
	    h[i]=Integer.parseInt(br.readLine());
	for(i=0;i<3;i++){
	    for(j=i+1;j<10;j++)
		if(h[i]<h[j]){
		    k=h[i];
		    h[i]=h[j];
		    h[j]=k;
		}
	    System.out.println(h[i]);
	}
	return;
    }
}