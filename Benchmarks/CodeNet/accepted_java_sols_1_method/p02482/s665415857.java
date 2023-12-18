import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{

	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			String s="";
			while((s=br.readLine())!=null){
				StringTokenizer st=new StringTokenizer(s," ");
				int x=Integer.parseInt(st.nextToken());
				int y=Integer.parseInt(st.nextToken());
				if(x>y){
					System.out.println("a > b");
				}else if(x<y){
					System.out.println("a < b");
				}else{
					System.out.println("a == b");
				}
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}