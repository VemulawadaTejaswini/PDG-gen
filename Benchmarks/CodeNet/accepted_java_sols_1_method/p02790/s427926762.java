import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int biggerNum = 0;
    int smallerNum = 0;

    if( a > b ){
      biggerNum = a;
      smallerNum = b;
    }else{
      smallerNum = a;
      biggerNum = b;
    }

    for(int i = 0; i < biggerNum; i++){
      System.out.print(smallerNum);
    }
  }
}
