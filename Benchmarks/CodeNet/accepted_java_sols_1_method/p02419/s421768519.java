import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String W  = br.readLine().toLowerCase();
        String T;
        int count = 0;
        while(!(T=br.readLine()).equals("END_OF_TEXT")){
        	String TList[] = T.toLowerCase().split(" ");
        	for(int i=0;i<TList.length;i++){
        		if(TList[i].equals(W)){
        			count++;
        		}
        	}

        }
        System.out.println(count);
    }
}