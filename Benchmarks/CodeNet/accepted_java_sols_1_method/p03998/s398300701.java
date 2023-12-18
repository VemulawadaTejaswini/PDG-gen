import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  String A = sc.next();
  String B = sc.next();
  String C = sc.next();
  int counterA = 0;
  int counterB = 0;
  int counterC = 0;
  char next = 'a';
  for(;;){
    if(next == 'a'){
      counterA++;
      if(counterA == A.length()+1){
        System.out.println("A");
        break;
      }
      else next = A.charAt(counterA-1);
    }
    else if(next == 'b'){
      counterB++;
      if(counterB == B.length()+1){
        System.out.println("B");
        break;
      }
      else next = B.charAt(counterB-1);
    }
    else if(next == 'c'){
      counterC++;
      if(counterC == C.length()+1){
        System.out.println("C");
        break;
      }
      else next = C.charAt(counterC-1);
    }
  }
}}