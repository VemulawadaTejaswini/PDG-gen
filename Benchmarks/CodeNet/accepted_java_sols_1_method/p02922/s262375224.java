import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int socket = sc.nextInt();
    int need = sc.nextInt();
    if(need == 1){
      System.out.println(0);
    }else if(socket == 1){
      System.out.println(need);
    }else if(need <= socket){
      System.out.println(1);
    }else if((need - socket) % (socket - 1) == 0){
      System.out.println(1 + (need - socket) / (socket - 1));
  }else{
    System.out.println(2 + (need - socket) / (socket - 1));
  }
}
}