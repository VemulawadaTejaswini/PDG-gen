import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.HashSet;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String N=sc.next();
    String V[]=N.split("");

   if(Integer.parseInt(V[V.length-1])==3){
     System.out.println("bon");

   }else if(Integer.parseInt(V[V.length-1])==0||Integer.parseInt(V[V.length-1])==1||Integer.parseInt(V[V.length-1])==6||Integer.parseInt(V[V.length-1])==8){
     System.out.println("pon");
   }else{
     System.out.println("hon");
   }



  }
}
