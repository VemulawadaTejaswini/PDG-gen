

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
 

public class Main{
          
    static int nowLoca=1;
     
     public static void main(String args[]){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         try{ String line;
             while((line=br.readLine())!=null){if(line.isEmpty())break;
               char[] chrs = line.toCharArray(); String bits="";
               for(char c:chrs){bits+=code(c);}
               int len=bits.length(); 
               if(len%5!=0){for(int i=1;i<=5-(len%5);i++){bits+="0";}}
               String res="";
               for(int i=0;i<bits.length()/5;i++){
                   String substr= bits.substring(0*i,0*i+4);
                   res+=code2(substr);
               }
                 System.out.println(res);
             } br.close();
            
         }catch(Exception e){e.printStackTrace();}         
     }  
     static String code2(String bits){
         if(bits.equals("00000")) return "A"; else if(bits.equals("00001"))return "B"; 
         else if(bits.equals("00010")) return "C"; else if(bits.equals("00011"))return "D"; 
         else if(bits.equals("00100")) return "E"; else if(bits.equals("00101"))return "F"; 
         else if(bits.equals("00110")) return "G"; else if(bits.equals("00111"))return "H"; 
         else if(bits.equals("01000")) return "I"; else if(bits.equals("01001"))return "J"; 
         else if(bits.equals("01010")) return "K"; else if(bits.equals("01011"))return "L"; 
         else if(bits.equals("01100")) return "M"; else if(bits.equals("01101"))return "N"; 
         else if(bits.equals("01110")) return "O"; else if(bits.equals("01111"))return "P"; 
         else if(bits.equals("10000")) return "Q"; else if(bits.equals("10001"))return "R"; 
         else if(bits.equals("10010")) return "S"; else if(bits.equals("10011"))return "T"; 
         else if(bits.equals("10100")) return "U"; else if(bits.equals("10101"))return "V"; 
         else if(bits.equals("10110")) return "W"; else if(bits.equals("10111"))return "X"; 
         else if(bits.equals("11000")) return "Y"; else if(bits.equals("11001"))return "Z"; 
         else if(bits.equals("11010")) return " "; else if(bits.equals("11011"))return "."; 
         else if(bits.equals("11100")) return ","; else if(bits.equals("11101"))return "-"; 
         else if(bits.equals("11110")) return "\'"; else if(bits.equals("11111"))return "?"; 
         else return "_INV_";
     }
    static String code(char c){
        switch(c){
            case ' ': return "101"; case '\'': return "000000";
            case ',': return "000011";  case '-': return "10010001";
            case '.': return "010001";    case '?': return "000001";
            case 'A': return "100101";          case 'B': return "10011010";
            case 'C': return "0101";            case 'D': return "0001";
            case 'E': return "110";            case 'F': return "01001";
            case 'G': return "10011011";            case 'H': return "010000";
            case 'I': return "0111";            case 'J': return "10011000";
            case 'K': return "0110";            case 'L': return "00100";
            case 'M': return "10011001";            case 'N': return "10011110";
            case 'O': return "00101";            case 'P': return "111";
            case 'Q': return "10011111";            case 'R': return "1000";
            case 'S': return "00110";            case 'T': return "00111";
            case 'U': return "10011100";            case 'V': return "10011101";
            case 'W': return "000010";            case 'X': return "10010010";
            case 'Y': return "10010011";            case 'Z': return "10010000";
        }return "Err";
    }
     
}