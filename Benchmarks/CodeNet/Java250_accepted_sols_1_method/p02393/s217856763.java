import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args){

		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			String buf = br.readLine();
			StringTokenizer st=new StringTokenizer(buf," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			int max ;
			int mid ;
			int min ;

			if(a <= b ){
				if(b <= c){
					max = c;
					mid = b;
					min = a;
				}else if(c <= a){
					max = b;
					mid = a;
					min = c;
				}else{
					max = b;
					mid = c;
					min = a;
				}
			}else{
				if(a <= c){
					max = c;
					mid = a;
					min = b;
				}else if(c <= b){
					max = a;
					mid = b;
					min = c;
				}else{
					max = a;
					mid = c;
					min = b;
				}
			}
			System.out.println(min + " "+ mid + " "+ max);
		} catch(IOException e) {
			System.err.println(e);
		}

	}
}