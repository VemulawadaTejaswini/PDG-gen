import java.util.Scanner;
class Try{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int get,num = 1;
    get=sc.nextInt();
    while (get != 0){
      get=sc.nextInt();
      System.out.println("Case "+num+": "+get);
      num++;
    }
  }
}

