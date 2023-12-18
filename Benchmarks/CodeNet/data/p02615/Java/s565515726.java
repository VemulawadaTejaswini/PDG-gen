import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int count = Integer.parseInt(line);
        line = sc.nextLine();
        String[] setting = line.split(" ");
        int[] points = new int[count];
        for(int i=0;i<count;i++){
          points[i] = Integer.parseInt(setting[i]);
        }
      
      	Arrays.sort(points);
      
       int answer = 0;
       for(int i=0;i<count-1;i++){
         if(i%2 ==0){
         	answer = answer + points[count - (i/2) -1];
         }else{
         	answer = answer + points[count - ((i+1)/2) -1];
         }
       }
       
      System.out.println(String.valueOf(answer));
    }
}