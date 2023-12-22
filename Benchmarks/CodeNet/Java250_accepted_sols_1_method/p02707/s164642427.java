import java.util.*;
 
class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      List<Integer> list = new ArrayList<Integer>();
      List<Integer> listAns = new ArrayList<Integer>();
      for(int i=1; i<N; i++){
        list.add(sc.nextInt());
      }
      for(int i=0; i<N; i++){
        listAns.add(0);
      }
      for(int i=1; i<N; i++){
        listAns.set(list.get(i-1) - 1, listAns.get(list.get(i-1) - 1) + 1);
      }
      for(Integer ans : listAns){
        System.out.println(ans); 
      }
    }
}