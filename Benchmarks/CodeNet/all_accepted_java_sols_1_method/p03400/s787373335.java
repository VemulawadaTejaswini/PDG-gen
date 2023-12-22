import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int d = sc.nextInt();
    int x = sc.nextInt();
    int[] ary = new int[n];
    int sum = 0;

    for(int i = 0; i < n; i++){
      int k = 0;
      ary[i] = sc.nextInt();
      while(k * ary[i] + 1 <= d){sum++; k++;}
    }

    System.out.println(x+sum);


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
