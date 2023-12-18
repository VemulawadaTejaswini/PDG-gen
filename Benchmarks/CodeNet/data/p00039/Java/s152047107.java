
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;



 class Main{
     static int charN(char c){
         if(c=='I') return 1;
         if(c=='V') return 5;
         if(c=='X')return 10;if(c=='L')return 50;if(c=='C')return 100;
         if(c=='D')return 500; if(c=='M')return 1000;
         return 0;
     }
     public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         String line;
         while(sc.hasNext()){
             line=sc.nextLine();
             if(line.isEmpty())break;
             int len=line.length(); int num=0;
             for(int i=0; i<len; i++){
                 if(i!=len-1){if(charN(line.charAt(i))< charN(line.charAt(i+1))){
                 num+=charN(line.charAt(i+1))-charN(line.charAt(i));i++;continue;}}
                 num+=charN(line.charAt(i));
             }
             System.out.println(num);
             
                
         }
         
         
     }
 }