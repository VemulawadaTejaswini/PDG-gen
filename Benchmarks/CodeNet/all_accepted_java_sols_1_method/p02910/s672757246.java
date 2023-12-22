import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String num = new String(in.readLine());
        String[] numarray = num.split("");
        boolean flg = true;

        for(int i = 1; i < numarray.length + 1; i++){
        	if(i % 2 == 0){
        		if(numarray[i-1].equals("R")){
        			flg = false;
        			break;
        		}
        	}else{
        		if(numarray[i-1].equals("L")){
        			flg = false;
        			break;
        		}
        	}
        }
        if(flg){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
	}
}