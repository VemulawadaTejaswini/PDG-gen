import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int n;
    String str = new String();

    n = s.nextInt();

    for(int i = 0;i < n;i++){
      try{
        str = bf.readLine();

        String[] word = str.split(" ", 0);
        String[] word2 = new String[word.length];

        for(i = 0;i < word.length;i++){
          if(word[i].equals("Hoshino")){
            word2[i] = "Hoshina";
          }else{
            word2[i] = word[i];
          }
        }

        str = "";

        for(i = 0;i < word.length - 1;i++){
          str = str + word2[i] + " ";
        }
        str = str + word2[word2.length - 1];
      }catch(IOException e){
        System.out.println(e);
      }

      System.out.println(str);
    }
  }
}