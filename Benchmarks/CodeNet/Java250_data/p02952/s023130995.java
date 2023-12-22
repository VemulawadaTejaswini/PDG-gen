import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    int output;
    if(input < 10){
      output = input;
    }else if(input < 100){
      output = 9;
    }else if(input < 1000){
      output = 9 + input - 99;
    }else if(input < 10000){
      output = 9 + 900;
    }else if(input < 100000){
      output = 9 + 900 + input - 9999;
    }else{
      output = 90909;
    }
    System.out.println(output);
  }
}