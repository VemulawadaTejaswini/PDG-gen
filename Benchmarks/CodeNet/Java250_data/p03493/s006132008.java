import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String[] b = a.split("");
    int count = 0;
    for(int i = 0; i < b.length; i++){
      if(b[i].equals("1")){
        count++;
      }
    }
    System.out.println(count);
  }
}
      