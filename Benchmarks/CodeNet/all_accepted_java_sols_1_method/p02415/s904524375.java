import java.io.*;
import java.util.Scanner;
public class Main{
	public static void main(String args[]){
    int i=0;
    int[] answer = new int[26];
    
    Scanner scan = new Scanner(System.in);
    while(scan.hasNext()){
    try{
      String line = scan.nextLine();
      for(i = 0;i < 1200;i++){
        int n = line.charAt(i);
        if(n >= 97 && n <= 122){
          char c= (char) (n - 32);
          System.out.print(c);
        }else if (n >= 65 && n <= 90){
          char c= (char) (n + 32);
          System.out.print(c);
        }else{
          System.out.print(line.charAt(i));
        }
      }
      
		}catch(Exception e){
      break;
    }
  }
  System.out.print("\n");
  

  }
}
