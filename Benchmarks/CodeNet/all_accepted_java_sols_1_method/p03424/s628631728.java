/*
char型->Stringへの変換はvalueOf()
*/

import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Set<String> set = new HashSet<>();
    for(int i = 0; i < n; i++){
      String s = sc.next();
      set.add(s);
    }
    char target = 'Y';
    if(set.contains(String.valueOf(target))){
      System.out.println("Four");
    }else{
      System.out.println("Three");
    }

  }
}

/*
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
String blank = sc.nextLine();
String s = sc.nextLine();
System.out.println();
System.exit(0)
*/
