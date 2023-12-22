import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int stay = Integer.parseInt(scanner.next());
    int FIRST_COST_STAY = Integer.parseInt(scanner.next());
    int FIRST_COST = Integer.parseInt(scanner.next());
    int SECOND_COST = Integer.parseInt(scanner.next());
    scanner.close();

    int cost = 0;

    if(stay < FIRST_COST_STAY){
      cost += stay * FIRST_COST;
    }else{
      cost += FIRST_COST_STAY * FIRST_COST + (stay - FIRST_COST_STAY) * SECOND_COST;
    }

    System.out.println(cost);
  }
}
