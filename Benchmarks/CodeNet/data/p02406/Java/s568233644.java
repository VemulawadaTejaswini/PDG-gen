import java.util.Scanner;

public class output(m){
 public static void main(String[] args) {
 

 }
}

public class Main {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int i;
  for(i = 1;i <= n;i++){
   for(int m=0;m*10 > i;m++){
    if(m != 0){
     i= i/(10^m);
    }
    if (i%3 == 0) {
     System.out.printf(" " + i);
    }else if(i%10 == 3){
     System.out.printf(" " + i);
    }else if(i > 10){
     int x = i;
    }
   }
  }
 System.out.println("");
 }
}