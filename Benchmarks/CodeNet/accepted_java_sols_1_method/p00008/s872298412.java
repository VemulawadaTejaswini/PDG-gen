import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
	BufferedReader br =
	    new BufferedReader(new InputStreamReader(System.in));
	String buf;
	int n;
	while(true){
	    int comb=0;
	    if((buf=br.readLine())==null)break;
	    if(buf.length()==0)break;
	    n=Integer.parseInt(buf);
	
	    for(int i=0;i<10;i++){
		for(int j=0;j<10;j++){
		    for(int k=0;k<10;k++){
			for(int l=0;l<10;l++){
			    if((i+j+k+l)==n)comb++;
			}
		    }
		}
	    }
	    System.out.println(comb);
	}
    }
}