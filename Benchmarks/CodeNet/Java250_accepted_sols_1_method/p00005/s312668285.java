import java.io.*;
class Main{

    public static void main(String[] args) throws IOException{
	int gcd,lcm;
	BufferedReader br=
	    new BufferedReader (new InputStreamReader(System.in));
	String buf;
	while(true){
	    if((buf=br.readLine())==null)break;
	    if(buf.length()==0)break;
	    String[] data=buf.split(" ");
	    int[] dat =new int[2];
	    for(int i=0;i<2;i++){
		dat[i]=Integer.parseInt(data[i]);
	    }
	    int x=dat[0],y=dat[1];
	    while(true){
		if(x==y)break;
		if(x > y) x-=y;
		else y-=x;
	    }
	    lcm=x;
	    double d=(double)dat[0]*(double)dat[1];
	    d/=(double)lcm;
	    gcd=(int)d;
	    System.out.println(lcm+" "+gcd);
	}
    }
}