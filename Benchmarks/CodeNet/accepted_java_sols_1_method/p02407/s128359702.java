import java.io.*;
   
class Main{
    public static void main(String[] args) throws IOException{
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int x = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
 
        for(int i = str.length; i > 0; i--){
		System.out.print(str[i-1]);
		if(i != 1){
			System.out.print(" ");
		}
	}
	System.out.println();
    }
}