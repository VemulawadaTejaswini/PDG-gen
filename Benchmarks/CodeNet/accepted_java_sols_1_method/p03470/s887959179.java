import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < n ; i ++){
          list.add(sc.nextInt());
        }
		 List<Integer> listB = new ArrayList<Integer>(new HashSet<>(list));
      
      	 System.out.print(listB.size());

    }
}




