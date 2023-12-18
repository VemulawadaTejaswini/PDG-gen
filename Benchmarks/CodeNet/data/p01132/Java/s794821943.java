//import java.io.File;
import java.util.Scanner;

public class Main{
  public static void main(String[] args) throws Exception {
    //Scanner scan = new Scanner(new File("in.txt"));
    Scanner scan = new Scanner(System.in);

    int price = scan.nextInt();

    while(price!=0) {
      int ot = scan.nextInt(), ft = scan.nextInt(), oh = scan.nextInt(), fh = scan.nextInt();
      int cot = 0, cft = 0, coh = 0, cfh = 0;

      int otRest = (price%50)/10;
      if(otRest <= ot) {
        price -= 10*otRest;
        ot -= otRest;
        cot += otRest;
      }
//System.out.println("  "+price);
      int otCan = (price/10)/5;
      otCan = Math.min(ot/5,otCan);
      price -= 50*otCan;
      ot -= 5*otCan;
      cot += 5*otCan;
//System.out.println("  "+price);

      int ftRest = (price%100)/50;
      if(ftRest <= ft) {
        price -= 50*ftRest;
        ft -= ftRest;
        cft += ftRest;
      }
//System.out.println("  "+price);
      int ftCan = (price/50)/2;
      ftCan = Math.min(ft/2,ftCan);
      price -= 100*ftCan;
      ft -= 2*ftCan;
      cft += 2*ftCan;
//System.out.println("  "+price);

      int ohRest = (price%500)/100;
      if(ohRest <= oh) {
        price -= 100*ohRest;
        oh -= ohRest;
        coh += ohRest;
      }
//System.out.println("  "+price);
      int ohCan = (price/100)/5;
      ohCan = Math.min(oh/5,ohCan);
      price -= 100*ohCan;
      oh -= 5*ohCan;
      coh += 5*ohCan;
      if((price/50)%2==1 && oh > 0) {
        price -= 100;
        oh --;
        coh ++;
      }
//System.out.println("  "+price);

      int fhCan = price/500;
      if(price%500 > 0) fhCan++;
      price -= 500*fhCan;
      fh -= fhCan;
      cfh += fhCan;
//System.out.println("  "+price);

      if(price < 0) {
        price*=-1;

        ohCan = price/100;
        price -= 100*ohCan;
        oh += ohCan;
        coh -= ohCan;
  //System.out.println("  "+price);

        ftCan = price/50;
        price -= 50*ftCan;
        ft += ftCan;
        cft -= fhCan;
  //System.out.println("  "+price);

        otCan = price/10;
        //price -= 10*otCan;
        ot += otCan;
        cot -= otCan;
  //System.out.println("  "+price);
      }

      if(cot > 0) System.out.println("10 " + cot);
      if(cft > 0) System.out.println("50 " + cft);
      if(coh > 0) System.out.println("100 " + coh);
      if(cfh > 0) System.out.println("500 " + cfh);

      price = scan.nextInt();
      if(price != 0) System.out.println();
    }
  }
}