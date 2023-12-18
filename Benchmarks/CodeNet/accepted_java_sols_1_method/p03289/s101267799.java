import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char str[] = sc.next().toCharArray();
    int count = 0;
    if (str[0] != 'A' || Character.isUpperCase(str[1]) || Character.isUpperCase(str[str.length-1])){
        System.out.println("WA");
        return;
    }
    for (int i=2 ; i < str.length-1; i++){
        if(Character.isUpperCase(str[i]) && str[i] =='C'){
            count++;
        }
    }
    System.out.println(count==1?"AC":"WA");
  }
}