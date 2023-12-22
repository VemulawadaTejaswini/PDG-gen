import java.util.*;

public class Main {
	

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		Set<String> set = new HashSet<String>();

        for(int i = 0; i<N; i++){
			try{
				set.add(sc.next());
			}catch(Error e){
			}
		}
		System.out.println(set.size());
        return;
	}


}
