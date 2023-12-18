import java.util.*;

  public class Main{
      public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] counter  =new int[30];
        
        int i;
        while(true){
        String str = sc.next();
        String str_low  =str.toLowerCase();
        if(str.equals(".")){
          break;
        }
        for(i=0;i<str.length();i++){
          char value = str_low.charAt(i);
          
          counter[value-97]++;
        }
      }
        for(i=97;i<123;i++){
          System.out.printf("%c : %d回\n",i,counter[i-97]);
        }
      }
    }
