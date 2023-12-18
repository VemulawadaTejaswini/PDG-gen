import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{


	public static void main(String[] args){

		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

		try{
		for(int i=1;;i++){
			int x=Integer.parseInt(reader.readLine());
			if(x==0)break;
			System.out.println("Case "+i+": "+x);

		}
		}catch(IOException e){
			System.out.println("??¨??????:"+e);

		}

	}

}