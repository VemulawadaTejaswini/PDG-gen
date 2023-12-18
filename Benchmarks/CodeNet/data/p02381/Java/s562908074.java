import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C10New {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		int i,n;
	    double m,a,sum1,sum2;
	    double[] x = new double[1000];

	    while(true){
	        sum1=0;
	        sum2=0;
	        a=0;
	        n = Integer.parseInt( br.readLine() );
	        if(n==0)break;

	    for(i=0;i<n;i++){
	    	try {
				x[i] = Double.parseDouble( br.readLine() );
			} catch (NumberFormatException e) {

				e.printStackTrace();
			}

	        sum1+=x[i];
	    }
	    m=sum1/n;
	    for(i=0;i<n;i++){
	            x[i]=(x[i]-m)*(x[i]-m);
	            sum2+=x[i];
	        }
	    a=Math.sqrt(sum2/n);
	    System.out.printf("%.8f\n",a);
	    }
	}

}