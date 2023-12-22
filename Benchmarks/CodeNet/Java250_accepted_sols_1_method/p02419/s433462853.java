import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String w=br.readLine();
		w=w.toLowerCase();
		int cnt=0;
		int sw=0;
		int ln=0;
		while(sw==0){
			ln++;
			String str=br.readLine();
			if(str.equals("END_OF_TEXT")){ sw=1;break;}
			str=str.toLowerCase();
			String[] t=str.split(" ");
			for(int i=0;i<t.length;i++){
				if(t[i].equals(w))	{cnt++;}
			}
		}
		System.out.println(cnt);
		
	}

}