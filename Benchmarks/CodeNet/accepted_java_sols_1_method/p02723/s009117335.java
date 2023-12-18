import java.util.*;

class Main{
    public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      String str = scan.nextLine();
      String[] coffee = str.split("");
      if(Objects.equals(coffee[2], coffee[3])){
        if(Objects.equals(coffee[4], coffee[5])) System.out.println("Yes");
        else System.out.println("No");
      } else System.out.println("No");
    }
}