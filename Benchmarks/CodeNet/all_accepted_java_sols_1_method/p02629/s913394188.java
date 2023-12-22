import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long N = scan.nextLong();
    String[] alp = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    long dec = 0;
    StringBuilder sb = new StringBuilder();
    while(N / 27 > 0){
      dec = N % 26;
      if (dec == 0) {
        dec = 26;
        N = N - 1;
      }
      int d = (int)dec;
      sb.append(alp[d - 1]);
      N = N / 26;  
    }
    dec = N % 26;
    if (dec == 0) {
      dec = 26;
    }
    int d = (int)dec;
    sb.append(alp[d - 1]);
    StringBuffer str = new StringBuffer(sb);
    String Name = str.reverse().toString();
    System.out.println(Name);
  }
}

