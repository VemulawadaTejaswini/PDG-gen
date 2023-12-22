import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
	public class Main {
		
	    public static void main(String[] args) throws IOException {
	    	Scanner teclado = new Scanner(System.in);
	    	int[][] x = new int[11][21];
	    	int a = teclado.nextInt();
	    	int b = teclado.nextInt();
	    	for(int i = 0;i<a;i++) {
	    		for(int ii = 0;ii<b;ii++) {
	    			x[i][ii] = teclado.nextInt();
	    		}
	    	}
	    	int orozco = 0;
	    	for(int i = 0;i<a-1;i++) {
	    		for(int ii = i+1;ii<a;ii++) {
	    			int orozcolord =0;
	    			for(int iii =0;iii<b;iii++) {
	    				orozcolord += (x[i][iii]-x[ii][iii])*(x[i][iii]-x[ii][iii]);
	    			}
	    			double sla = Math.sqrt(orozcolord);
	    			if(sla == (int)sla) {
	    				orozco++;
	    			}
	    		}
	    	}
	    	System.out.println(orozco);
	    }
	
	}