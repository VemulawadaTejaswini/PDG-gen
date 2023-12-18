import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int x[] = new int[10000];
        int i=0;
        try{
            while(!(str = br.readLine()).equals("0")){
                x[i] = Integer.parseInt(str);
                i++;
            }
        }catch(IOException e){
            
        }
        for(int j=0;j<i;j++){
            System.out.println("Case "+(j+1)+": "+x[j]);
        }
    }
}