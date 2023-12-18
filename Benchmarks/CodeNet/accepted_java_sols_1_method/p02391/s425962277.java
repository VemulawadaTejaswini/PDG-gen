import java.io.*;

class Main{
	public static void main(String[] args){
		// System.out.println("Please enter a and b");
		try{
			BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
			String str = buf.readLine();
			String[] ent = str.split(" ");
			int a = Integer.parseInt(ent[0]);
			int b = Integer.parseInt(ent[1]);

			if ( a < b ){
				System.out.println("a < b");
			}else if( a > b ){
				System.out.println("a > b");
			}else{
				System.out.println("a == b");
			}
		} catch(IOException e){
			System.out.println("入力がおかしいです。");
		}

	}
}
