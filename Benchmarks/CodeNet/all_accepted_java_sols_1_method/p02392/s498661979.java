import java.io.*;
 
class Main{
    public static void main(String[] args) throws IOException{
     
        int x,y,z;
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = br.readLine().split(" ");
        x = Integer.parseInt(str[0]);
        y = Integer.parseInt(str[1]);
	z = Integer.parseInt(str[2]);

	if(x<y && y<z){
        	System.out.println("Yes");

	}else{
		System.out.println("No");
	}
    }
}