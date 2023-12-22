import java.util.*;
public class Main{
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);



while(true){
  int a = sc.nextInt();
  int b = sc.nextInt();
  int saisi = sc.nextInt();
  int c = a+b;
  if(a==-1 && b==-1 && saisi==-1){
    break;
  }
if(a==-1||b==-1){
  System.out.println("F");
}else if(c >= 80){
 System.out.println("A");
}else if(c >= 65){
  System.out.println("B");
}else if(c >= 50){
  System.out.println("C");
}else if(c >= 30){
  if(saisi >= 50){
    System.out.println("C");

  }else{
    System.out.println("D");
  }

}else {
  System.out.println("F");
}
}
//sc.close();
}
}

