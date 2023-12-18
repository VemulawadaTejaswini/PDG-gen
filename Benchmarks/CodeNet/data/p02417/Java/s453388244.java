import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] chars = new int[256];
    for(int i=0;i<256;i++){
      chars[i]=0;
    }
    while(sc.hasNextLine()){
      String line = sc.nextLine();
      for(int i=0;i<line.length();i++){
        char ch = Character.toLowerCase(line.charAt(i));
        int n = ch-'a';
        chars[n]++;
      }
    }
    for(char ch ='a';ch <='z';ch++){
      System.out.println(ch+":"+chars[ch]);
    }
  }
}