import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	String a = sc.next().substring(0,1).toUpperCase();
	String b = sc.next().substring(0,1).toUpperCase();
	String c = sc.next().substring(0,1).toUpperCase();
    System.out.println(a+b+c);
  }
}