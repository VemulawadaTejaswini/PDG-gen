import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String h[]=new String[11];
        int a[][] = new int[10][100];
        int i=0;
        int j;

        try {
        while(!(h[i] = br.readLine()).equals("-")){
        	j = Integer.parseInt(br.readLine());
        	for(int m=0; m < j; m++){
        		a[i][m] = Integer.parseInt(br.readLine());
        	}
        	i++;
        }

        } catch (IOException e) {
        	e.printStackTrace();
        }
        for(int k=0; k<i; k++){
        	for(int l=0; l < 100; l++) {
        		if(a[k][l]==0) break;
        		String first = h[k].substring(0, a[k][l]);
        		String last = h[k].substring(a[k][l]);
        		h[k] = last + first;
        	}
        	System.out.println(h[k]);
        }

    }
}
