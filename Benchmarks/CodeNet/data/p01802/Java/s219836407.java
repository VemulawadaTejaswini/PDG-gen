import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	while(true){
	    String str[]=br.readLine().split(" ");

	    int d=Integer.parseInt(str[0]);
	    int e=Integer.parseInt(str[1]);

	    if(d==0&&e==0)
		break;

	    double min=Double.MAX_VALUE;
	    for(int i=0;i<=100;i++){
		for(int j=0;j<=100;j++){
		    if(i+j==d){
			double dist=Math.sqrt(i*i+j*j);

			double value=Math.abs(dist-e);
			min=Math.min(min,value);
		    }
		}	
	    }

	    System.out.println(min);
	}
    }
}

