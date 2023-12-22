import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt(),b=sc.nextInt();
    String  str = sc.next();
    String[] strarr = str.split("");
    if(strarr[b-1].equals("A")){
      strarr[b-1] = "a";
    }
    else if(strarr[b-1].equals("B")){
      strarr[b-1] = "b";
    }
    else if(strarr[b-1].equals("C")){
      strarr[b-1] = "c";
    }
    String str2 = String.join("",strarr);
    System.out.println(str2);
  }
}