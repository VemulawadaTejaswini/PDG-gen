import java.util.Scanner;
import java.io.*;

class Main {
    public static void main(String[] args)throws IOException{ 
    	InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader read = new BufferedReader(in);
    	   	                                                 
    	String str = read.readLine();
        String fixed = str;
        String fixeD;
        
        
        int item = Integer.parseInt(read.readLine());

        for(int count = 0; count < item; count++){
            String line = read.readLine();
            String [] spli = line.split(" ");          //???????????????

            if(spli [0].equals("print")){            	
            	fixeD = fixed.substring(Integer.parseInt(spli [1]), Integer.parseInt(spli [2])+1);         
                System.out.println(fixeD);            	
            } 
            else if(spli [0].equals("replace")){
                String left = str.substring(0, Integer.parseInt(spli [1]));
                String right = str.substring(Integer.parseInt(spli [2])+1, fixed.length());
                fixed = left + spli[3] + right;
            } 
            else{
                String part1 = fixed.substring(0, Integer.parseInt(spli [1]));
                String part2 = fixed.substring(Integer.parseInt(spli [2])+1, fixed.length());
                String reversing = fixed.substring(Integer.parseInt(spli [1]), Integer.parseInt(spli [2])+1);
                StringBuffer reversinG = new StringBuffer(reversing);
                reversinG.reverse();
                fixed = part1 + reversinG +part2; 
                
            }
        }
    }
}