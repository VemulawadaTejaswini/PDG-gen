import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String[] input = new String[3];
    for(int i=0; i<3; i++){
      input[i] = scanner.next();
    }
    scanner.close();

    if(input[1].equals("+")){
      System.out.println(Integer.parseInt(input[0])+Integer.parseInt(input[2]));
    }else{
      System.out.println(Integer.parseInt(input[0])-Integer.parseInt(input[2]));
    }
  }
}
