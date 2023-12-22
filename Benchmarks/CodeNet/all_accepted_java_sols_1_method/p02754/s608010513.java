import java.util.*;
public class Main {
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  // 整数の入力
  // int a = sc.nextInt();
  // スペース区切りの整数の入力
  long n = sc.nextLong();
  long a = sc.nextLong();
  long b = sc.nextLong();

  // 文字列の入力
 long amari =  n %  (a + b);
 long syo = n/(a+b);
 	
 	
 		if(amari>=a){
  	 System.out.println(a+syo*a);

 		}else{
 			  	 System.out.println(amari+syo*a);
 		}
 	
 	
 // String s = sc.next();
// 	if(s.matches(".*A.*") & s.matches(".*B.*")){
 //	}else{
 //		 	 System.out.println("No");
 //	}
 }
}
