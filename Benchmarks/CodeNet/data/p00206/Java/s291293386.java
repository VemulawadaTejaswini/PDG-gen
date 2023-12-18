import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    int goal;
    int bank = 0;
    int income, outcome;
    int achive_month = -1;
    Scanner s = new Scanner(System.in);
    boolean modified = false;

    while(true){
      goal = s.nextInt();

      for(int i = 0;i < 12;i++){
        income = s.nextInt();
        outcome = s.nextInt();
        bank += income - outcome;

        if(bank >= goal){
          if(!modified){
            achive_month = i + 1;
            modified = true;
          }
        }
      }

      if(achive_month > 0){
        System.out.println(achive_month);
      }else{
        System.out.println("NA");
      }

      bank = 0;
      achive_month = -1;
      modified = false;
    }
  }
}