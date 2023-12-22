import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
        List<Integer> list = Arrays.asList(sc.nextInt(), sc.nextInt(), sc.nextInt());
        Collections.sort(list);
        System.out.println(list.get(2) - list.get(0));
	}
}
