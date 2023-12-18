import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] product = {1,2,3,4,5,6,7,8,9,10,12,14,15,16,18,20,21,24,25,27,28,30,32,35,36,40,42,45,48,49,54,56,64,72,81};
    boolean bl = false;
    for(int i = 0; i < product.length; i++){
      if(n == product[i]){
        bl = true;
      }
    }
    if(bl){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}