import java.io.*;

public class Main{
	public static void main(String[] args)throws IOException, NumberFormatException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder builder = new StringBuilder();
		
		while(true){
			String[] score = br.readLine().split(" ");
			int m = Integer.parseInt(score[0]);
			int f = Integer.parseInt(score[1]);
			int r = Integer.parseInt(score[2]);
			if( m==-1 && f==-1 && r==-1 ) break;
			
			if( m==-1 || f==-1 ){
				builder.append("F");
			}else{
				if( m+f >= 80 ) builder.append("A");
				else if( m+f >= 65 ) builder.append("B");
				else if( m+f >= 50 ) builder.append("C");
				else if( m+f >= 30 ){
					if( r >= 50 ) builder.append("C");
					else builder.append("D");
				}else builder.append("F");
			}
			
			
			builder.append("\n");
		}
		
		System.out.print(builder);
	}
}