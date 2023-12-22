import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main{
    public static void main(String[] a) throws IOException{
    	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
 	int mountains[] = new int[10];
        
        for(int i=0;i<10;i++){
                mountains[i] = Integer.parseInt(in.readLine());
        }
        
        Arrays.sort(mountains);
        
        for(int i = mountains.length-1;i > mountains.length-4;i--){
            System.out.println(mountains[i]);
        }
    }
}