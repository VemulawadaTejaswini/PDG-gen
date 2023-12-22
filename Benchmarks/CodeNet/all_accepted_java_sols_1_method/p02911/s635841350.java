import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();//参加者数
    int k = sc.nextInt();//参加者の持ち点
    int q = sc.nextInt();//問題数


    //参加者それぞれの点数を格納した配列
    ArrayList<Integer> plyr = new ArrayList<Integer>(n);
    for (int i=0 ; i<n ; i++){
      plyr.add(k-q);
    }
    
    for (int i=0 ; i<q ; i++){
      int se = sc.nextInt()-1;
      plyr.set(se, plyr.get(se) + 1);
    }

    //sorezore tensu
    for(int i=0;i<n;i++){
      if(plyr.get(i) < 1){
          System.out.println("No");
      }else{
          System.out.println("Yes");
      }
    }
  }
}