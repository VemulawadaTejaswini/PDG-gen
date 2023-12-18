import java.io.*;
import java.util.*;

class Main{
	public void start(){
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			while(true){
				String str = input.readLine();
				String array[] = str.split(" ");
				int m = Integer.parseInt(array[0]);
				int f = Integer.parseInt(array[1]);
				int r = Integer.parseInt(array[2]);
				int x = 0;
				x = m + r + f;
				if(x==-3)break;
				achievement(m, f, r);
			}
		}catch(IOException e){
			e.printStackTrace();
		}		
	}
	
	public void achievement(int a,int b,int c){
		if(a==-1 || b==-1){
			System.out.println("F");
		}else if(a+b>=80){
			System.out.println("A");
		}else if(65<=a+b&&a+b<80){
			System.out.println("B");
		}else if(50<=a+b&&a+b<65){
			System.out.println("C");
		}else if(30<=a+b&&a+b<50){
			if(50<=c){
				System.out.println("C");
			}else{
				System.out.println("D");
			}
		}else if(a+b<30){
			System.out.println("F");
		}
	}
	
	public static void main(String[] args){
		Main main = new Main();
		main.start();
	}
}