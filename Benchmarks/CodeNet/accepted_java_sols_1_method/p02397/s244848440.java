import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a,b;

		StringBuilder sb = new StringBuilder();
		while(true){
			String[] spl = br.readLine().split(" ");
            a=Integer.parseInt(spl[0]);
            b=Integer.parseInt(spl[1]);

            if(a==0 && b==0){
            	break;
            }
            else if(a>b){
            	sb.append(b).append(" ").append(a).append("\n");
            }else{
            	sb.append(a).append(" ").append(b).append("\n");
            }


		}
		System.out.print(sb);
	}
}