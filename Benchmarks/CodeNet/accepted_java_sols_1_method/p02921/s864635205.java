import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int count = 0;

    String[] str1 = sc.next().split("");
    String[] str2 = sc.next().split("");

    for(int i=0; i<3; i++){
      if(str1[i].equals(str2[i])){
        count +=1;
      }
    }
    System.out.println(count);
  }

}