import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int e = sc.nextInt();
    int f = sc.nextInt();
    List<Integer> x = new ArrayList<>();
    List<Integer> y = new ArrayList<>();
    for(int i = 0; i * 100 <= f; i++){
      for(int j = 0; (j + i) * 100 <= f; j++){
        if(i == 0 && j == 0) continue;
        x.add((i * a + j * b) * 100);
      }
    }
    
    double maxSuger = f / 100 * e;
    for(int i = 0; i <= maxSuger; i++){
      for(int j = 0; i*c + j*d <= maxSuger; j++){
        y.add(i * c + j * d);
      }
    }
    double max = -1;
    int maxWater = -1;
    int maxS = -1;
    for(int water : x){
      for(int suger : y){
        if((f < water + suger) || (water / 100 * e < suger)){
          continue;
        }else{
          if(max < ((double)suger / (water + suger))){
            max = (double)suger / (water + suger);
            maxWater = water + suger;
            maxS = suger;
          }
        }
      }
    }
    System.out.println(maxWater + " " + maxS);
  }
}