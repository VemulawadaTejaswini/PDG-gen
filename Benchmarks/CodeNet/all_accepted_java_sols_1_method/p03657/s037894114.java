import java.util.Scanner;


class Main { //クラス名はMain
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int a = s.nextInt();
      int b = s.nextInt();
      if(a%3==0 || b%3==0 || (a+b)%3==0){
        System.out.println("Possible");
      }else{
        System.out.println("Impossible");

      }
    }
}
