import java.io.*;

class Main{
	public static void main(String[] args){
		// System.out.println("Please enter three integers");
		try{
			BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
			String str = buf.readLine();
			String[] input = str.split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			int c = Integer.parseInt(input[2]);
			if(a < b && b < c){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}catch(IOException e){

		}
	}
}
