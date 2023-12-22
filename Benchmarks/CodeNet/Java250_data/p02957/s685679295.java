import java.util.Scanner;
import java.util.*;
 class Main{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
if(Math.abs(num1 + num2) % 2 ==0 || num1 - num2 ==0 ){
        System.out.println(Math.abs(num1 + num2) / 2);
}else{
  System.out.println("IMPOSSIBLE");
}
}
}

