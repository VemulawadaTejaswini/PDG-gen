import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    //input
    int n = sc.nextInt();

    //output
    char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    //System.out.println(alphabet.length);

    String name = "";
    boolean leftBoundFound = false;
    for(int i = 13; i >= 0; i--){ //decrease from 13 to 0
      if( (int)(n/ (Math.pow(26,i)) ) > 1 ){
        leftBoundFound = true;
        int count = (int)(n/(Math.pow(26,i)));
        name += alphabet[count-1];
        n = n%(int)(Math.pow(26,i));
      }else{
        if( leftBoundFound ){
          name = name + "a";
        }
      }
    }
    System.out.println(name);
  }
}
