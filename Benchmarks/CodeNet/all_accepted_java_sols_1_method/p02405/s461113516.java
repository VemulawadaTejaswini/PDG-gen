import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int H; int W;

    do{
      H = scan.nextInt();
      W = scan.nextInt();
      if(H==0 && W==0){break;}

        //????????????????????????
      StringBuilder sb1 = new StringBuilder();//??¶??°??? ??????02468
      StringBuilder sb2 = new StringBuilder();//?\???°??? ??????13579
      for(int i=0; i<W; i++){
        if(i%2==0){sb1.append("#"); sb2.append(".");}
        else{sb1.append("."); sb2.append("#");}
      }

      for(int j=0; j<H; j++){
        if(j%2==0){System.out.println(sb1);}
        else {System.out.println(sb2);}
      }
      System.out.println("");
    } while(H!=0 || W!=0);
     
  }
}