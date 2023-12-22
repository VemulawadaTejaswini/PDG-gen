import java.io.*;

class Main{
	
	public static void main(String[] args)throws IOException{
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder result = new StringBuilder();
		
		while(true){
			String tmp = input.readLine();
			String[] strInput = tmp.split(" ");
			int x = Integer.parseInt(strInput[0]);
			int y = Integer.parseInt(strInput[1]);
			
			if(x == 0 && y == 0){
				break;
			}
			
			if(x > y){
			    int temp = x;
			    x = y;
			    y = temp;
			   
			}

			result.append(x + " " + y + "\n");
		}
	       
		System.out.print(result);
		
	}
	
}