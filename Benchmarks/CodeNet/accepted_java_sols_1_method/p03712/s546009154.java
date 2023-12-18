import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    String blank = sc.nextLine();
    String[] s = new String[h];

    for(int i = 0; i < h; i++){
      s[i] = sc.nextLine();
    }

    for(int i = 0; i < w+2; i++){System.out.print('#');}
    System.out.println("");
    for(int i = 0; i < h; i++){
      System.out.print('#');
      System.out.print(s[i]);
      System.out.println('#');
    }
    for(int i = 0; i < w+2; i++){System.out.print('#');}
    System.out.println("");
    

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
