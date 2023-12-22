import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args)throws IOException{
		String a;
		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		a=br.readLine();
		StringTokenizer st=new StringTokenizer(a," ");
		
		int x=Integer.parseInt(st.nextToken());
		int y=Integer.parseInt(st.nextToken());
		if(x>y){System.out.println("a > b");
		}else if(x<y){System.out.println("a < b");
		}else{
			System.out.println("a == b");
		}
		
}
	}