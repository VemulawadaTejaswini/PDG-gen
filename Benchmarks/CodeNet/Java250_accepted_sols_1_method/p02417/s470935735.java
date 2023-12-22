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
          answer[n - 97] += 1;
        }else if (n >= 65 && n <= 90){
          answer[n - 65] += 1;
        }else{

        }
      }
      
		}catch(Exception e){
    }
  }
  for(i = 0;i<26;i++){
    char c= (char) ('a' + i);
    System.out.println(c + " : "+answer[i]);
  }
  

  }
}
