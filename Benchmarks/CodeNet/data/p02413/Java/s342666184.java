import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
	public static void main(String[] args) throws IOException{
    	int r,c;
    	int total= 0;
    	String input;
    	String[] strArray;
    	BufferedReader br;
    	br = new BufferedReader(new InputStreamReader(System.in));
    	input = br.readLine();
    	strArray = input.split(" ");

    	r = Integer.parseInt(strArray[0]);
    	c = Integer.parseInt(strArray[1]);

        int [][] a = new int [r+1][c+1];

    	for(int i = 0; i < r; i++){
    		input = br.readLine();
    		strArray = input.split(" ");
			for(int j = 0; j < c+1; j++){
				if(j != c){
					a[i][j] = Integer.parseInt(strArray[j]);
					a[r][j] += a[i][j];
	    			System.out.print(a[i][j]+" ");
	    			total += a[i][j];
				}
				else{
					a[i][j] = total;
					System.out.println(a[i][j]);
					a[r][j] += a[i][j];
				}
			}
			total = 0;
    	}

    	for(int i = 0; i < c+1; i++){
    		System.out.print(a[r][i]+" ");
    	}
System.out.println();
    }

}