import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = 0; i < n; i++)
			arr.add(in.nextInt());
		Collections.sort(arr);
		Collections.reverse(arr);
		
		ArrayList<Integer> a = removeDuplicates(arr);
		
		
		int sum = arr.get(0);
		int temp = n - 2;
		int curr = 1;
		while(temp > 0)
		{
			if(temp == 1) 
			{
				sum += arr.get(curr);
				break;
			}
			else
			{
				sum += 2 * arr.get(curr);
				temp -= 2;
				curr++;
			}
		}
		
		System.out.println(sum);
		

	}
	public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) 
    { 
  
        // Create a new LinkedHashSet 
        Set<T> set = new LinkedHashSet<>(); 
  
        // Add the elements to set 
        set.addAll(list); 
  
        // Clear the list 
        list.clear(); 
  
        // add the elements of set 
        // with no duplicates to the list 
        list.addAll(set); 
  
        // return the list 
        return list; 
    } 
}