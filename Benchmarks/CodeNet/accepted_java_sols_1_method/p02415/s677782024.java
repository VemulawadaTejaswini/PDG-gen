import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    try{
      String sen = sc.nextLine();
      for(int i=0;i<sen.length();i++){
        if(Character.isUpperCase(sen.charAt(i))){
          System.out.print(Character.toLowerCase(sen.charAt(i)));
        }else{
          System.out.print(Character.toUpperCase(sen.charAt(i)));
        }
      }
      System.out.println();
    }catch(Exception e){
    }
    sc.close();
  }
}
