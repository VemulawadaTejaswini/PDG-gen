import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;
class Main{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
int N = scan.nextInt();
String S = scan.next();
int count = 0;
String[] split = S.split("");
for (int i = 0;i < N-2; i++) {
  if (split[i].equals("A")) {
    if (split[i+1].equals("B")) {
      if (split[i+2].equals("C")) {
        count += 1;
      }
    }
  }
}
System.out.println(count);
}
}
