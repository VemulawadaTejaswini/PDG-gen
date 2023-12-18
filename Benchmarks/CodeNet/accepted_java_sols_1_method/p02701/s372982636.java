import java.util.HashSet;
import java.util.Scanner;
public class Main{
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    int count = 0 ;
    HashSet<String> set = new HashSet<>();
    for(int i = 0 ;i < num ; i++){
        String str = s.next();
        if(!set.contains(str)){
            set.add(str);
            count++;
        }
    }
    System.out.println(count);
  }
}