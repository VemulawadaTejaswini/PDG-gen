import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();
    System.out.println(a%10+(a/10)%10+(a/100)%10);
  }
}