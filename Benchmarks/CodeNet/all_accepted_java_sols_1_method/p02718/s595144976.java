import java.util.ArrayList;
import java.util.Scanner;

class Main{
  public static void main(String[] args){
    int n,m;
    ArrayList<Integer> score = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    m = sc.nextInt();
    int x;
    double border = 0;
    for(int i=0;i<n;i++){
      score.add(sc.nextInt());
      border+=score.get(score.size()-1);
    }
    border/=4*m;
    int list = 0;
    for(int i=0;i<score.size();i++){
      if(score.get(i)>=border)
        list++;
    }
    if(list>=m)
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}