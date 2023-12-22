import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
	ArrayList<Integer> list = new ArrayList<>();
	for(int i=0; i<num; i++){
		list.add(sc.nextInt());
	}
	List<Integer> listB = new ArrayList<Integer>(new LinkedHashSet<>(list));
	System.out.println(listB.size());
  }
}