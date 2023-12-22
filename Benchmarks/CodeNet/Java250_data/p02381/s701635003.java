import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();
    try{
      while(true){
        int n = sc.nextInt();
        if(n==0) break;
        for(int i=0;i<n;i++){
          int S = sc.nextInt();
          list.add(S);
        }
        double Avg=0, sig=0;
        for(Integer num : list){
          Avg += num;
        }
        Avg = Avg / list.size();
        for(Integer num : list){
          sig += Math.pow((num - Avg), 2);
        }
        sig = sig / list.size();
        System.out.println(Math.sqrt(sig));
        list.clear();
      }
    }catch(Exception e){
    }
    sc.close();
  }
}
