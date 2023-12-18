import java.util.*;

//update 2020/1/1 23:01
//XXXXXXXXXX16行目XXXXXXXXXXXXX

public class Main{

  static Scanner sc = new Scanner(System.in);
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) {

    int n = nextInt();
    int m = nextInt();

    //隣接行列（これがメモリオーバーしてる）
    //boolean[][] G = new boolean[n][n];
    List<Integer>[] G = new ArrayList[n];
    for(int i=0;i<n;i++){
      G[i] = new ArrayList<>();
    }

    for(int i=0;i<m;i++){
      int a = nextInt() - 1;
      int b = nextInt() - 1;
      G[a].add(b);
      G[b].add(a);

    }

    //ノードiのノード0までの距離を格納
    int[] kyori = new int[n];
    //今探索している場所の距離
    int cnt = 1;

    //ノードiを検出済みかどうか
    boolean[] seen = new boolean[n];
    Arrays.fill(seen,false);

    //これから隣接を探索するリスト
    ArrayDeque<Integer> todo = new ArrayDeque<>();

    seen[0] = true;
    todo.add(0);

    //これから隣接を探索するノード番号
    int v = 0;

    //幅の大きさ
    int width = 1;

    while(todo.size()>0){

      v = todo.removeFirst();

      //vがどこと繋がっているか見る
      for(int i : G[v]){
        if(!seen[i]){ //未検出なら
          seen[i] = true; //検出済みにする
          todo.addLast(i); //探索リストに追加
          kyori[i] = cnt;
        }
      }

      //深さ記録
      width --;
      if(width==0){
        cnt++;
        width = todo.size();
      }

    }

    System.out.println("Yes");

    for(int i=1;i<n;i++){
      for(int j : G[i]){
        if(kyori[i]>kyori[j]){
          System.out.println(j+1);
          break;
        }
      }
    }


/*
    boolean[] ok = new boolean[n];

    if(ok[0]){
      System.out.println("trueでした");
    }
    else{
      System.out.println("falseでした"); 〇〇〇〇〇
    }
*/

  }

  static int lcm(int a,int b){
    return a*b*gcd(a,b);
  }

  static int gcd(int a,int b){
    if(a%b!=0){
      return gcd(b,a%b);
    }
    else{
      return b;
    }
  }

  /*
    static String toSmall(String s){
      char c = s.charAt(0);
      //if(Character.isUpperCase(c)){
      if(c<=90){
        c += 32;
      }
      return String.valueOf(c);
    }
    static String toBig(String s){
      char c = s.charAt(0);
      //if(Character.isLowerCase(c)){
      if(c>=97){
        c -= 32;
      }
      return String.valueOf(c);
    }
  */

  static String toSmall(String s){
    return s.toLowerCase();
  }

  static String toBig(String s){
    return s.toUpperCase();
  }

  static String next(){
    return sc.next();
  }

  static int nextInt(){
    return Integer.parseInt(sc.next());
  }

  static long nextLong(){
    return Long.parseLong(sc.next());
  }

  static double nextDouble(){
    return Double.parseDouble(sc.next());
  }

  static String[] splitString(String s){
    return s.split("");
  }

  static char[] splitChar(String s){
    return s.toCharArray();
  }

  static int charToInt(char a){
    return a - 48;
  }

////////////////////////////////////////////
  public static int max(int[] a){
    int lng = a.length;
    int max = a[0];
    for(int i=1;i<lng;i++){
      max = Math.max(max,a[i]);
    }
    return max;
  }
  public static long max(long[] a){
    int lng = a.length;
    long max = a[0];
    for(int i=1;i<lng;i++){
      max = Math.max(max,a[i]);
    }
    return max;
  }
////////////////////////////////////////////

////////////////////////////////////////////
  public static int min(int[] a){
    int lng = a.length;
    int min = a[0];
    for(int i=1;i<lng;i++){
      min = Math.min(min,a[i]);
    }
    return min;
  }
  public static long min(long[] a){
    int lng = a.length;
    long min = a[0];
    for(int i=1;i<lng;i++){
      min = Math.min(min,a[i]);
    }
    return min;
  }
////////////////////////////////////////////

}
