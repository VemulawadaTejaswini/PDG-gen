import java.io.*;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s;
    char a;
    int cnt[];
    cnt=new int[26];
    while(true){
      s=sc.next();
      s=s.toLowerCase();
      for(int i=0;i<s.length();i++){
        a=s.charAt(i);
        if(a>='a' && a<='z') cnt[a-'a']++;
      }
      if(!(sc.hasNext())) break;
    }
    char abc='a';
    for(int i=0;i<26;i++){
      System.out.println((char)(abc+i)+" : "+cnt[i]);
    }
  }
}

