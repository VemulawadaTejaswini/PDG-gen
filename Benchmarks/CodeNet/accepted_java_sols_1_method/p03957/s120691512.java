import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        boolean Cfound=false;
        boolean Ffound=false;
        for(int i=0;i<line.length();i++){
        	if(Cfound){
        		if(line.charAt(i)=='F') Ffound=true;
        	}
        	else if(line.charAt(i)=='C') Cfound=true;
        }
        
        if(Ffound) System.out.println("Yes");
        else System.out.println("No");
    }
}