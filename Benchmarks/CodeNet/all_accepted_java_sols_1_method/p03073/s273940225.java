import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next(); //Input String
    int N = s.length(); //Size of the input string    
    //Case 1: 101010101010
    int caseoneanswer = 0;
    for(int i = 1; i<=N; i++){
      if(i%2 == 1 && s.charAt(i-1) == '0'){
        caseoneanswer++; 
      } 
      if(i%2 == 0 && s.charAt(i-1) == '1'){
        caseoneanswer++; 
      }
    }
    //Case 2: 01010101010
    int casetwoanswer = 0;
    for(int i = 1; i<=N; i++){
      if(i%2 == 1 && s.charAt(i-1) == '1'){
        casetwoanswer++;
      }
      if(i%2 == 0 && s.charAt(i-1) == '0'){
        casetwoanswer++; 
      }
    }
    System.out.println(Math.min(caseoneanswer, casetwoanswer));
  }
}