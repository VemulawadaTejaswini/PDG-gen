import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] setting = line.split(" ");
      
        int deskA = Integer.parseInt(setting[0]);
        int deskB = Integer.parseInt(setting[1]);
        int time = Integer.parseInt(setting[2]);
      List<Integer> booksA = new ArrayList<Integer>();
      List<Integer> booksB = new ArrayList<Integer>();
      
      line = sc.nextLine();
      String[] inputA = line.split(" ");
      for(String input : inputA){
        booksA.add(Integer.parseInt(input));
      }
      line = sc.nextLine();
      String[] inputB = line.split(" ");
      for(String input : inputB){
        booksB.add(Integer.parseInt(input));
      }
      
      int count = 0; 
      while(true){
        if(booksA.size() ==0 && booksB.size()==0){
          break;
        } else if(booksA.size() == 0 || (booksA.get(0) >= booksB.get(0))){
          if((time - booksB.get(0)) >= 0){
            time = time - booksB.get(0);
            count++;
            booksB.remove(0);
          } else {
            break;
          }
        } else if(booksA.size() != 0){
          if((time - booksA.get(0)) >= 0){
            time = time - booksA.get(0);
            count++;
            booksA.remove(0);
          } else {
            break;
          }
        } else {
          break;
        }
      }
      
      System.out.println(String.valueOf(count));
    }
}