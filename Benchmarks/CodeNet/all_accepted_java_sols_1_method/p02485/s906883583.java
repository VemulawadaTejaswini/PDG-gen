import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
		try{
			String st = br.readLine();
			if(st.equals("0")){break;}
			char[] ch = st.toCharArray();
			int a = 0;
			for(int i=0;i<ch.length;i++){
				a += Integer.parseInt(ch[i]+"") ;
			}
			System.out.println(a);
		} catch(Exception e){}
		}

	}
}