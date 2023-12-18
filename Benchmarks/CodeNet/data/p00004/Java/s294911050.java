import java.io.*;
class Main{

    public static void main(String[] args)throws IOException{
	BufferedReader br =
	    new BufferedReader(new  InputStreamReader(System.in));
	String buf;
	double[][] data=new double[2][3];
	double x,y;
	while(true){
	    buf=br.readLine();
	    if(buf==null)break;
	    String[] buf2=buf.split(" ");
	    for(int i=0;i<data.length;i++){
		for(int j=0;j<data[i].length;j++){
		    data[i][j]=Double.parseDouble(buf2[i*3+j]);
		}
	    }
	    double a,b,c,d;
	    a=(data[0][2] * data[1][1] - data[0][1] * data[1][2]);
	    b=(data[0][0] * data[1][1] - data[1][0] * data[0][1]);
	    c=(data[0][2] * data[1][0] - data[1][2] * data[0][0]);
	    d=(data[0][1] * data[1][0] - data[0][0] * data[1][1]);
	    x = a / b;
	    y = c / d;
	    if(x==-0)x=0;if(y==-0)y=0;
	    System.out.print(String.format("%.3f",x));
	    System.out.print(" ");
	    System.out.println(String.format("%.3f",y));
	}
    }
}