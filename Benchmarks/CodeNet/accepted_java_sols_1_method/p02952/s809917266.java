import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    if(N<10){System.out.println(N);}
    else if(N<100){System.out.println(9);}
    else if(N<1000){System.out.println(N-90);}
    else if(N<10000){System.out.println(909);}
    else if(N<100000){System.out.println(N-9090);}
    else{System.out.println(90909);}
  }
}