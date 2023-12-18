import java.io.*;

class Main {
	public static void main(String[] args) {
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			while(true){
			 String buf = br.readLine();

			 String[] line = buf.split(" ");
			 int x = Integer.parseInt(line[0]);
			 int y = Integer.parseInt(line[1]);			
				if( x ==0 && y == 0) break;
				if( x > y){
					System.out.print(y+" "+x);
				} else if( x < y ){
					System.out.print(x+" "+y);
				} else {
					System.out.print(x+" "+y);
				}
				System.out.print("\n");
			
			}
		} catch(Exception e){
		}
	} 
}