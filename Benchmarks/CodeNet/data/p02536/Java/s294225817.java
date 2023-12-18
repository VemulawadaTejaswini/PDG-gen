import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int M = sc.nextInt();
      int[] group = new int[N];
      
      // 都市を結ぶ
      int groupCount = N;
      int groupId = 1;
      for(int i = 0; i < M; i++){
        int A = sc.nextInt()-1;
        int B = sc.nextInt()-1;
        int idA = group[A];
        int idB = group[B];
        if(idA == 0 && idB == 0){
          group[A] = groupId;
          group[B] = groupId;
          groupId++;
          groupCount--;
        }
        else if(idA == 0 && idB != 0){
          group[A] = group[B];
          groupCount--;
        }
        else if(idA != 0 && idB == 0){
          group[B] = group[A];
          groupCount--;
        }
        else if(idA != idB){
          union(idA, idB, N, group);
          groupCount--;
        }
      }
      
      // 出力
      System.out.println(groupCount-1);
    }
    
    // グループを統合する関数
    public static void union(int X, int Y, int N, int[] group){
      for(int i = 0; i < N; i++){
        if(group[i] == X){
          group[i] = Y;
        }
      }
    }
    

}