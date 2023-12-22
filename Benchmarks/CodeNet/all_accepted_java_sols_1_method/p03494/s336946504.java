import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>(n);
		for(int i = 0; i < n; i++) list.add(sc.nextInt());
		int count =0;
		while(list.stream().allMatch(i -> i %2 == 0)){
			list = list.stream().map(i -> i /2).collect(Collectors.toList());
			count++;
		}
		System.out.println(count);
	}
}