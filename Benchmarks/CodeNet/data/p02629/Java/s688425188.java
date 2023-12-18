import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();

    String name = "";
    String alphabet = "";
    for(char c = 'a'; c <= 'z'; c++){
      alphabet = alphabet + c;
    }

    for(int i=0; i<100; i++){
      if(N <= 26){
        name = alphabet.charAt((int)(N + 25) % 26) + name;
        System.out.println(name);
        return;
      }else{
        int index = (int)((N + 25) % 26);
        name = alphabet.charAt(index) + name;
        N = N - index;
        N = N / 26;
      }
    }
    return;
  }
}