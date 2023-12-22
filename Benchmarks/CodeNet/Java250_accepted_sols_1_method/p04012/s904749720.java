import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  String w = sc.next();
  char[] alp = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
  boolean b = true;
  for(int i = 0;i < 26;i++){
    int counter = 0;
    for(int j = 0;j < w.length();j++){
      if(w.charAt(j) == alp[i]){
        counter++;
      }
    }
    if(counter%2 == 1){
      b = false;
      System.out.println("No");
      break;
    }
  }
    if(b)System.out.println("Yes");
}}