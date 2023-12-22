import java.io.*;

public class Main{
	public static void main(String[] args)throws IOException, NumberFormatException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder builder = new StringBuilder();
		
		while(true){
			String[] s = br.readLine().split(" ");
			int num = Integer.parseInt(s[0]);
			int x = Integer.parseInt(s[1]);
			if( num==0 && x==0 ) break;
			
			int count = 0;
			for( int i=1 ; i<=num-2 ; i++ ){
				for( int j=i+1 ; j<=num-1 ; j++ ){
					for( int k=j+1 ; k<=num ; k++ ){
						if( i+j+k==x ) count++;
					}
				}
			}
			
			builder.append(count).append("\n");
		}
		
		System.out.print(builder);
	}
}