import java.util.Scanner;

class Main{
	public static void main(String[] arg){
	
		
		Scanner sc = new Scanner(System.in);
	        String str= sc.next().toLowerCase();   

                int cnt=0;
		 while(true){
			 String str2= sc.next();
			 if(str.equals(str2.toLowerCase())){
                                  cnt++;
				 
			 }if(str2.equals("END_OF_TEXT")){
				 break;
			 }
		 }
		 System.out.println(cnt);

		}}
