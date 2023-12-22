import java.util.Scanner;

class Main {

    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int num = Integer.parseInt(sc.nextLine());
      String values = sc.nextLine();
      String costs = sc.nextLine();

      int result = 0;
      for(int i= 0; i<num; i++){
        int v = Integer.parseInt(values.split(" ")[i]);
        int c = Integer.parseInt(costs.split(" ")[i]);
        if(v>c) result += v-c;
      }
      System.out.println(result);
    }


}