import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long A = Long.parseLong(scanner.next());
    float B = Float.parseFloat(scanner.next());
    scanner.close();

    long A_1 = 0l;
    long A_2 = 0l;
    long B2 = (long)(B*100);
    long ans = 0l;
    String ansString = "";
    if(A > 10000000000l){
      A_1 = A/10000000000l;
      A_2 = A%10000000000l;
      double n = Math.log10(A_2*B2/100l);
      ansString += A_1*B2;
      if(n<1){
        System.out.println(ansString+"00000000");
      }else{
        for(int i=0; i<7-n; i++){
          ansString += 0;
        }
        ansString += A_2*B2/100l;
        System.out.println(ansString);
      }
    }else{
      ans = (A*B2)/100l;
      System.out.println(ans);
    }
  }
}
