import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int s=scanner.nextInt();
    int flg1=0;
    int flg2=0;

    int sl=s/100;
    int sr=s%100;
    //YYMM
    if(sr>0&&sr<13){
      flg1=1;
    }
    //MMYY
    if(sl>0&&sl<13){
      flg2=1;
    }

    if(flg1==0){
      if(flg2==0) System.out.println("NA");
      else System.out.println("MMYY");
    }
    else{
      if(flg2==0) System.out.println("YYMM");
      else System.out.println("AMBIGUOUS");
    }
    //System.out.println(ans);
  }
}
