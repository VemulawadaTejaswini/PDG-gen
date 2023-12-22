import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	HashMap<Integer, Integer> dict = new HashMap<>();
		int N = sc.nextInt();      	 
      	int Current;
      	for(int i=0 ;i<N;i++)
        {
          	Current=sc.nextInt();
          	if(dict.containsKey(Current))
            {
          		System.out.println("NO");
              	System.exit(0);
            }
          	else 
            {
              	dict.put(Current, 1);              	
            }
        }
      	System.out.println("YES");
	}
}