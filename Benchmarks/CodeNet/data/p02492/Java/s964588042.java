import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[] ) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String str=br.readLine();
			if(str==null){
				break;
			}
			String[] param=str.split(" ");						int ans;
			if(param[1].equals("?")){
				break;
			}
			else if(param[1].equals("+"){
				ans=Integer.parseInt(param[0])+Integer.parseInt(param[1]);
			}
			else if(param[1].equals("-"){
				ans=Integer.parseInt(param[0])-Integer.parseInt(param[1]);
			}

			else if(param[1].equals("*"){
				ans=Integer.parseInt(param[0])*Integer.parseInt(param[1]);
			}

			else if(param[1].equals("/"){
				ans=Integer.parseInt(param[0])/Integer.parseInt(param[1]);
			}

			System.out.println(ans);
		}
	}
}