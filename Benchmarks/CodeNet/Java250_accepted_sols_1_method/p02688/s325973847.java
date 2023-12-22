import java.util.*;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int peopleNum = sc.nextInt();  // 人数
      	int snackNum = sc.nextInt();  // お菓子の数
      	
      	List<Integer> ownList = new ArrayList<Integer>();
      	for(int i = 0; i < snackNum; i++){
          	int ownNum = sc.nextInt();  // お菓子を持っている人数
          	for(int j = 0; j < ownNum; j++){
              int people = sc.nextInt();  // お菓子を持っている人
              ownList.add(people);
            }
        }
      
      	// お菓子を持っている人の重複を排除 -> お菓子を持っている人数
      	List<Integer> ownListB = new ArrayList<Integer>(new LinkedHashSet<>(ownList));
      	int size = ownListB.size();
      
      	// 全人数 - お菓子を持っている人数 = お菓子を持っていない人数
      	System.out.println(peopleNum - size);
    }
}