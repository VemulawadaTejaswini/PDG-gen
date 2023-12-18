import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nam = sc.nextInt();
      	Set<Integer> set = new HashSet<Integer>();
      		
 		for(int i = 0;i < nam ;i++){
        	set.add(sc.nextInt());
        }
      System.out.print(set.size());
    }
}