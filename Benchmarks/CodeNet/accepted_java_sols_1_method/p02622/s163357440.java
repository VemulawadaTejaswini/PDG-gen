import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] inputA = line.split("");
        line = sc.nextLine();
        String[] inputB = line.split("");
      
      int count =0;
      for(int i=0;i<inputA.length;i++){
        if(!inputA[i].equals(inputB[i])){
          count++;
        }
      }
       System.out.println(String.valueOf(count));
    }
}