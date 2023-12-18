import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 try{
			 int W,H,x,y,r;
			 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 String str = br.readLine();
			 String[] strAry = str.split(" ");
			 
			 W = Integer.parseInt(strAry[0]);
			 H = Integer.parseInt(strAry[1]);
			 x = Integer.parseInt(strAry[2]);
			 y = Integer.parseInt(strAry[3]);
			 r = Integer.parseInt(strAry[4]);
			 
			 if(x-r>=0 && x+r<=W && y-r>=0 && y+r<=H){
				 System.out.println("Yes");
			 }else{
				 System.out.println("No");
			 }
		 }catch(IOException e){
			 e.printStackTrace();
		 }
	}

}