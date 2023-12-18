import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int before = scan.nextInt();
    int after = scan.nextInt();
    int sum = scan.nextInt();

    while(!(before==0&&after==0&&sum==0)) {
      int max = -1;
      for(int i = 1; i < sum; i++) {
        int j = sum-i;
        int removeTaxA = (int)Math.floor((i+1)*(100.0/(100.0+before)));
        int removeTaxB = (int)Math.floor((j+1)*(100.0/(100.0+before)));
        int addTaxA = (int)Math.floor(removeTaxA*((100.0+after)/100.0));
        int addTaxB = (int)Math.floor(removeTaxB*((100.0+after)/100.0));
        int result = addTaxA + addTaxB;
        if(max<result) {
          //System.out.printf("%d,%d,%d,%d,%d,%d\n",i,j,removeTaxA,removeTaxB,addTaxA,addTaxB);
          max = result;
        }
      }

      System.out.println(max);

      before = scan.nextInt();
      after = scan.nextInt();
      sum = scan.nextInt();
    }
  }
}