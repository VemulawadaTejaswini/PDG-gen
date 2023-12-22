import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
      	sc.nextLine();
		Set<String> kind=new LinkedHashSet<>();
		for(int i=0;i<n;i++){
			kind.add(sc.nextLine());
		}
		System.out.println(kind.size());
	}
}