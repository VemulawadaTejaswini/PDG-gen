import java.io.*;

class Main
{
	public static void main ( String[] args ) throws IOException{
		BufferedReader br = 
		new BufferedReader(new InputStreamReader(System.in));
		String str =   br.readLine();  
		String[] strAry = str.split(" ");

		int x = Integer.parseInt(Ary[0]);
		int y = Integer.parseInt(Ary[1]);
		
		if( x < y ){
			System.out.println( " a < b ");
		}else if( x > y ){
			System.out.println( " a > b ");
		}else{
			System.out.println(" a == b " );
		}
	}
}