
import java.io.IOException;
import java.util.Scanner;

class Main {
	
	public static void main(String[] args)throws IOException{
		
		Scanner in=new Scanner(System.in);
		while(true){
			String a=in.next();
			if(a.equals("END")){
				if(in.next().equals("OF")){
					if(in.next().equals("INPUT")){
						break;
					}
				}
				
				}
			System.out.println(a);
			System.out.print(a.length());
			
		}
		
	}
}