//0305
import java.util.*;

class Main {
  static int[][] map = new int[7][5];
  static ArrayList<Integer> listx = new ArrayList<>();
  static ArrayList<Integer> listy = new ArrayList<>();
  static TreeSet<Integer> answer = new TreeSet<>();

  public static void main(String[] args){
    //declare
    Scanner in = new Scanner(System.in);
    int N,r,t;
    //imput
    N = Integer.parseInt(in.next());
    for(int i=0;i++<N;){
      r = Integer.parseInt(in.next()); t = Integer.parseInt(in.next());
      //calclate
      calc(r, t);
      for(int l=0;l<listx.size();l++)
        for(int m=0;m<listy.size();m++)
          answer.add(map[listx.get(l)][listy.get(m)]);
      listx.clear();
      listy.clear();
      //output
      for(Integer s: answer){System.out.print(s + " ");}
      answer.clear();
    }
  }

  public static void calc(int y, int x){
    for(int i=0;i<=180;i+=30){
      if(x==i){listx.add(i/30);break;}
      else if(x<i){listx.add(i/30);listx.add(i/30-1);break;}
    }
    for(int j=100;j<=500;j+=100){
      if(y==j){listy.add(j/100);break;}
      else if(y<j){listy.add(j/100);listy.add(j/100-1);break;}
    }
    for(int i=0;i<7;i++)
      for(int j=0;j<5;j++)
        map[i][j] = j + i * 5;
  }
}