import java.io.*;

public class Main{
 public static void main(String[] args){
	try{  
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  	 int x  = Integer.parseInt(br.readLine());
  	 String[] str = br.readLine().split(" ");

		for(int i = str.length-1;  i >= 0; i--){
			if(i != 0){
		 	 System.out.print(str[i] + " ");
			}else{
		 	 System.out.println(str[i]);
			}
		}
	}catch(IOException e){
	 System.out.println(e);
	}
}
}