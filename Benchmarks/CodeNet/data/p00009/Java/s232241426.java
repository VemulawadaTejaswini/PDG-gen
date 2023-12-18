import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
	public static void main(String args[] ) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String num=br.readLine();
			if(num==null){
				break;
			}
			int n = Integer.parseInt(num);
			for(n=n;n>=2;n--){
				boolean check=true;
				if(n>2){
					for(int m=2;m<n;m++){
						if(n%m==0){
							check=false;
							break;
						}
					}
				}
				if(check==true){
					System.out.println(n);
				}
			}
		}
	}
}