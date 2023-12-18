import java.util.*;
class Main{
  static Scanner sc = new Scanner(System.in);
  static int routes[][];
  static int N;
  static int M;
  public static void main(String[] args){
    N = sc.nextInt();
    M = sc.nextInt();
    routes = new int[N][N];
    int A,B;
    for(int i=0;i<M;i++){
      sc.nextLine();
      A = sc.nextInt();
      B = sc.nextInt();
      routes[A-1][B-1] = 1;
      routes[B-1][A-1] = 1;
    }
	System.out.println("Yes");
    int answers[] = new int[N];
    for(int i=1;i<N;i++){
      System.out.println(optimize(i)[1]+1);
    }
    
  }

  public static int[] optimize(int room){
    if(routes[0][room]==1){
      return new int[]{1,0};
    }
    else{
      ArrayList<Integer> list = new ArrayList<>();
      for(int i=0;i<N;i++){
        if(routes[room][i]==1){
          list.add(i);
        }
      }
      int minDistance = Integer.MAX_VALUE;
      int answer=0;
      int distance;
      for(Integer i:list){
        distance = optimize(i,room)[0] + 1;
        if(minDistance > distance){
          minDistance = distance;
          answer = i;
        }
      }
      return new int[]{minDistance,answer};
    }
  }
  
  public static int[] optimize(int room, int exclude){
    if(routes[0][room]==1){
      return new int[]{1,0};
    }
    else{
      ArrayList<Integer> list = new ArrayList<>();
      for(int i=0;i<N;i++){
        if(i!=exclude && routes[room][i]==1){
          list.add(i);
        }
      }
      int minDistance = Integer.MAX_VALUE;
      int answer=0;
      int distance;
      for(Integer i:list){
        distance = optimize(i,room)[0] + 1;
        if(minDistance > distance){
          minDistance = distance;
          answer = i;
        }
      }
      return new int[]{minDistance,answer};
    }
  }
}