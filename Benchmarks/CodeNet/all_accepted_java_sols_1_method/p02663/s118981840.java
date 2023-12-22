import java.util.*;

class Main{

  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    int H1=s.nextInt();
    int M1=s.nextInt();
    int H2=s.nextInt();
    int M2=s.nextInt();
    int K=s.nextInt();
    
    System.out.println(H2*60+M2-H1*60-M1-K);
  }  
}