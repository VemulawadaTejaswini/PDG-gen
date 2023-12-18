import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int d = sc.nextInt();
			arr.add(d);
            }
        Collections.sort(arr,Collections.reverseOrder());	
    
		int count = 0;		
		for(int i=0; i < arr.size(); i++) 
		{
          //indentical
		  for(int j=0; (j < arr.size()&&(arr.get(j)) >= (arr.get(i))); j++)
          {
            if((i!=j) && (arr.get(i) == arr.get(j)))
            {count++;break;}
          }
          for(int j=i; j < arr.size(); j++)
          {
              if ((arr.get(i)>arr.get(j)) && (arr.get(i) % arr.get(j) ==0))
			{count++; break;}
		  }
		}
		System.out.println(arr.size()-count);
	}
}