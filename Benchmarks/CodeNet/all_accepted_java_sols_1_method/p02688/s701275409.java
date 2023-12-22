import java.util.Scanner;
import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int sunuke = sc.nextInt();
        int kashi = sc.nextInt();
      HashSet set = new HashSet();
      int motteru = 0;
      for(int i = 0; i < kashi; i++){
        motteru = sc.nextInt();
        for(int j = 0; j < motteru;j++) set.add(sc.nextInt());
      }
        
        System.out.println(sunuke - set.size());
    } 
}