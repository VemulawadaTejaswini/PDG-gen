import java.util.Scanner;
//import java.io.*;

 class Main {
    public static void main(String[] args){ 
    	Scanner scan = new Scanner(System.in);
    	   	                                                 
    	String str;
    	
    	while(true){
    		str = scan.next();
    		if(str.equals("0")){
    			break;
    		}else{       
    			char[] charA;
    			charA = str.toCharArray();   //char????????????
    			int intt = 0;
    			for(int keta = 0; keta < charA.length; keta++){
    				char charAB = charA[keta];
    				intt += Integer.parseInt(""+charAB);   //int??????
    			}
    			System.out.println(intt);
    		}    			
    	}  	
     }
}