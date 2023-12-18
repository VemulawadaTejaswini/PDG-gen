import java.io.*;

public class Main{
	public static void main(String[] args)throws IOException, NumberFormatException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		StringBuilder builder = new StringBuilder();
		
		while(true){
			String[] s = br.readLine().split(" ");
			int h = Integer.parseInt(s[0]);
			int w = Integer.parseInt(s[1]);
			if( h==0 && w==0 ) break;
			
			// ???????????°?????????
			for( int i=1 ; i<=h ; i++ ){
				// ????????°?????????
				for( int j=1 ; j<=w ; j++ ){
					if( i==1 || i==h ){
						builder.append("#");
					}else{
						if( j==1 || j==w ){
							builder.append("#");
						}else{
							builder.append(".");
						}
					}
				}//???
				builder.append("\n");
			}//??????
			builder.append("\n");
		}
		System.out.print(builder);
	}
}