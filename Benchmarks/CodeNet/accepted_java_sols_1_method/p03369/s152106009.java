import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] a =sc.nextLine().split("");
    int count = 0;
    for (int i=0;i<a.length;i++){
        if(a[i].equals("o")){
            count=count+1;
        }
    }
    System.out.println(700+count*100);
  }
}