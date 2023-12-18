import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main{

	public static void main(String[] args)  throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			
			String s = buf.readLine();
			String[] strlAry =s.split(" ");

			for(int i=0;i<strlAry.length;i++){
			}
			int a = Integer.parseInt(strlAry[0]);
			int b = Integer.parseInt(strlAry[1]);
			
		if(a != 0 && b != 0){
			for(int y = 1; y <= a ; y++){
				for ( int x = 1; x <= b ; x++ )	{
					System.out.print( "#" );
				}
				System.out.println();
			}
			continue;
		}
		else  if(a == 0 && b == 0){
			break;			}
		}
	}
}