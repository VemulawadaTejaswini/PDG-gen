import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);

    while(true){
      int m = scan.nextInt();
      int f = scan.nextInt();
      int r = scan.nextInt();
      if(m==-1 && f==-1 && r==-1) break;

      if(m==-1 || f==-1){
        System.out.println("F");
        continue;
      }
      int sum=m+f;
      if(sum<30) System.out.println("F");
      else if(sum<50){
        if(r>=50){
          System.out.println("C");
        }else{
          System.out.println("D");
        }
      }else if(sum<65) System.out.println("C");
      else if(sum<80) System.out.println("B");
      else System.out.println("A");
    }
  }
}

