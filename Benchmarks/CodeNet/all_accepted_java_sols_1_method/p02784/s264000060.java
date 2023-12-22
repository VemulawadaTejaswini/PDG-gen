import java.util.Scanner;
public class Main{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int Hp = sc.nextInt();
    int N = sc.nextInt();

    for(int i = 0; i < N; i++){
      int attack = sc.nextInt();
      Hp = Hp - attack;
    }

    if(Hp > 0){
      System.out.println("No");
    }else{
      System.out.println("Yes");
    }
  }
}