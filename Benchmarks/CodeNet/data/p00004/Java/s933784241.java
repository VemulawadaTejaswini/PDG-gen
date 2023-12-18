import java.io.*;
import java.text.DecimalFormat;
class Main{

    public static void main(String[] args)throws IOException{
	BufferedReader br =new BufferedReader(new  InputStreamReader(System.in));
	String buf;
	double[][] data=new double[2][3];
	double x,y;
	while((buf=br.readLine()) != null){
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
	    System.out.println(c);
	    d=(data[0][1] * data[1][0] - data[0][0] * data[1][1]);
	    System.out.println(d);
	    x = a / b;
	    y = c / d;
	    DecimalFormat decimalFormat1 = new DecimalFormat("#.000");
	    System.out.print(decimalFormat1.format(x));
	    System.out.print("\t");
	    System.out.println(decimalFormat1.format(y));
	}
    }
}