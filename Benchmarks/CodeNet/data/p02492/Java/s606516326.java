import java.io.*;
import java.util.*;
class Main{
	public static void print(Object o){
		System.out.println(o);
	}
		public static String in(){
		
		InputStreamReader is = new InputStreamReader(System.in);
		       
        BufferedReader br = new BufferedReader(is);  
		
		String str = "Sorry";
		
		try{
			str = br.readLine();	
			
		}catch(IOException e){
			//Sorry
		}
				return(str);
	}
	public static void main(String[] args){
		String r = "0";
		String[] t;
		int[] n = new int [2];
		while(r != null){
			r = in();
			t = r.split(" ");
			n[0] = Integer.parseInt(t[0]);
			n[1] = Integer.parseInt(t[2]);
			if((t[1]).equals("?")){
				break;
			}else if((t[1]).equals("+")){
				print(n[0]+n[1]);
			}else if((t[1]).equals("-")){
				print(n[0]-n[1]);
			}else if((t[1]).equals("*")){
				print(n[0]*n[1]);
			}else if((t[1]).equals("/")){
				if(n[1] != 0){
				print(n[0]/n[1]);
				}else{
					int a = 0;
					print(a);
				}
			}
		}
	}
}