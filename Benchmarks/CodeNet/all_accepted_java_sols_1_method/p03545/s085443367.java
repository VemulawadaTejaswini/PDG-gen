import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
  String s = sc.next();
  int A = Integer.valueOf(s.charAt(0)-'0');
  int B = Integer.valueOf(s.charAt(1)-'0');
  int C = Integer.valueOf(s.charAt(2)-'0');
  int D = Integer.valueOf(s.charAt(3)-'0');
  int e = 0,f = 0,g = 0,h = 0;
  out:
  for(int i = 0;i<2;i++){
    for(int j = 0;j < 2;j++){
      for(int k = 0;k < 2;k++){
        for(int l = 0;l < 2;l++){
          if(Math.pow(-1,i)*A + Math.pow(-1,j)*B + Math.pow(-1,k)*C + Math.pow(-1,l)*D == 7){
            e=i;f=j;g=k;h=l;
            break out;
          }
        }
      }
    }
  }
  System.out.print(e == 0 ? "":"-");
  System.out.print(A);
  System.out.print(f == 0 ? "+":"-");
  System.out.print(B);
  System.out.print(g == 0 ? "+":"-");
  System.out.print(C);
  System.out.print(h == 0 ? "+":"-");
  System.out.print(D);
  System.out.println("=7");
}}