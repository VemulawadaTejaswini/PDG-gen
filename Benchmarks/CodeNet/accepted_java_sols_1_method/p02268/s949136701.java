import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		ArrayList<int[]> arrayList = new ArrayList<int[]>();
		
		while (in.hasNextLine())
		{
			int lineNumber = in.nextInt();
			int[] array = new int[lineNumber];
			in.nextLine();
			
			int i = 0;
			
			while (i < lineNumber && in.hasNextInt())
			{
				array[i] = in.nextInt();
				i++;
			}
			
			arrayList.add(array);
			
			if (in.hasNextLine())
			{
				in.nextLine();
			}
		}
		
		int[] qArray = arrayList.get(1);
		int[] sArray = arrayList.get(0);
		int count = 0;
		
		for (int i = 0; i < qArray.length; i++)
		{
			int l = 0;
			int r = sArray.length - 1;
			while (l <= r)
			{
				int mid = (l + r) / 2;
				if (qArray[i] > sArray[mid]) {
					l = mid + 1;
				} else if (qArray[i] < sArray[mid]) {
					r = mid - 1;
				} else if (qArray[i] == sArray[mid]){
					count++;
					break;
				}
			}
		}
		
		System.out.println(count);
	}

}
