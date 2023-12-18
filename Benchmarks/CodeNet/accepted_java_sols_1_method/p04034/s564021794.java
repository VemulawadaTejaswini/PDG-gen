import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//String tmp = sc.next();
		//int tmp = sc.nextInt();
		//Long tmp = sc.nextLong();
      int N = sc.nextInt();
      int M = sc.nextInt();
      int[] list = new int[N];
      Arrays.fill(list,1);
      Set<Integer> redVisited = new HashSet<Integer>();
      redVisited.add(0);
      for(int i = 0; i < M; i++){
        int before = sc.nextInt() - 1;
        int after = sc.nextInt() - 1;
        list[before]--;
        list[after]++;
        if(redVisited.contains(before)){
          redVisited.add(after);
        }
        if(list[before] == 0){
          redVisited.remove(before);
        }
      }
      System.out.println(redVisited.size());
	}
}
