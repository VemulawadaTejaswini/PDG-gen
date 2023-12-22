import java.util.Scanner;

public class Main{
  public static void main(String[] args){

    //String a = Scanner(System.in).nextLine();
    //String[] array = a.split(" ");
    //int[] intArray = new int[arrat.length];
    //for(int i=0; i<array.length; i++){
    //  intArray[i]=Integer.parseInt(array[i]);
    //}

    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();

    if ((A%3==0) || (B%3==0) || ((A+B)%3==0)) {
        System.out.println("Possible");
    }else{
        System.out.println("Impossible");
    }
  }
}
