import java.util.Scanner;
//import java.io.*;

class Main {
    public static void main(String[] args){ 
    	Scanner scan = new Scanner(System.in);
    	   	                                                 
    	String stR,str; 
        char[] atoz;
        int ascii; 
        char alpha = 'a';

                
        int [] AtoZ = new int[26];

        while(scan.hasNext()){
            stR = scan.nextLine();
            str = stR.toLowerCase();    //?°??????????
            atoz = str.toCharArray();   //char??????

                for(int ch = 0; ch < atoz.length; ch++){   //???????????¢?????????????????????
                ascii = atoz[ch] - 'a';
                if(ascii >=0 && ascii <26){
                	AtoZ[ascii]++;
                }
                }            
        }

        for(int j = 0; j < 26; j++){
        System.out.println(alpha+" : "+ AtoZ[j]);
        alpha++;
        }
     }
}