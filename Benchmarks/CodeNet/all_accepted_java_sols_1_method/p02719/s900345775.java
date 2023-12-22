import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    long N =sc.nextLong();
    long K =sc.nextLong();
    long C =N%K;
    long D =K/2;
    if(C<=K/2){System.out.println(C);}
    else{System.out.println(K-C);}
  }
}
