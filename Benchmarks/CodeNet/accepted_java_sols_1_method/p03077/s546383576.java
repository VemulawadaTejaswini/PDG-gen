import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N=sc.nextLong();
    long Ts[]=new long[5];
    Ts[1]=sc.nextLong();
    Ts[0]=sc.nextLong();
    Ts[2]=sc.nextLong();
    Ts[3]=sc.nextLong();
    Ts[4]=sc.nextLong();

    long mi=Ts[0];
    for(int i=0;i<5;i++){
    if(Ts[i]<mi){mi=Ts[i];}
  }


    System.out.println((N + mi - 1)/mi+4);
  }
}
