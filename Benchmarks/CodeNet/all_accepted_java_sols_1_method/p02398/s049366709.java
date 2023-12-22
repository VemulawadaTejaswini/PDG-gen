import java.io.*;
  
class Main{
	public static void main(String[] args) throws IOException{

		int x,y,z;
		int count = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		x = Integer.parseInt(str[0]);
		y = Integer.parseInt(str[1]);
		z = Integer.parseInt(str[2]);

		for(int i=x; i<=y; i++){
			if(z%i == 0){
				count++;
			}
		}
		System.out.println(count);
    	}
}