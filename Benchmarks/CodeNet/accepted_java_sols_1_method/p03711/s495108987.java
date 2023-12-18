import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
    int b = sc.nextInt();
    int[] array = {0,2,0,1,0,1,0,0,1,0,1,0};
    if (array[a-1]==array[b-1]){
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}