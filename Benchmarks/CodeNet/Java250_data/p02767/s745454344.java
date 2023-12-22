import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] coordinates = new int[n];
    int max = 1;
    int min = 100;
    for(int i = 0; i < n; i++){
      coordinates[i] = sc.nextInt();
      max = Math.max(max, coordinates[i]);
      min = Math.min(min, coordinates[i]);
    }
    int energy = 250000;
    for(int i = min; i <= max; i++){
      int eachCase = 0;
      for(int j = 0; j < n; j++){
        eachCase += (i - coordinates[j]) * (i - coordinates[j]);
      }
      energy = Math.min(energy,eachCase);
    }
    System.out.println(energy);
  }
}