import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

int N=sc.nextInt();
int L=sc.nextInt();

List<String> list = new ArrayList<String>();

	for(int i = 0; i < N; i++){
		list.add(sc.next());
	}
	
	Collections.sort(list);
	
	for(String i : list) {
		System.out.print(i);
	}

}
}