import java.io.*;
public class max {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine( );
        String[] stringLine = line.split("\n");
        int k = stringLine.length;
        int[] numArrayN = new int[k];
        int[] numArrayX = new int[k];
        int count = 0;
        for(int j=0;j<k;j++){
        	numArrayN[j] = Integer.parseInt(stringLine[j].split(" ")[0]);
        	numArrayX[j] = Integer.parseInt(stringLine[j].split(" ")[1]);
        	for(int s=1;s<=numArrayN[j];s++){
        		for(int t=s+1;t<=numArrayN[j];t++){
        			for(int u=t+1;u<=numArrayN[j];u++){
        				if(s+t+u==numArrayX[j]){
        					count++;
        				}
        			}
        		}
        	}
        	System.out.println(count);
        }
	}

}