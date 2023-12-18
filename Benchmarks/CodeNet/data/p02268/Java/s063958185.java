import java.util.Scanner;

public class Main {
	
	static int binarySearch(int[] a, int[] b) {
		int counter = 0;
		int mid = 0;
		for(int i=0; i<b.length; i++){
			int L = 0;
			int R = a.length-1;
			
			while(L<=R)
			{
				mid = (L+R)/2;
//				System.out.println("mid: "+ mid);
				if(b[i]==a[mid])
				{
					counter++;
					break;
				}
				else if(b[i]<a[mid])
				{
					R = mid-1;
				}
				else if(b[i]>a[mid])
				{
					L = mid+1;
				}
			}		
		}
		return counter;
	}
	
    public static void main(String argv[]) {

        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();

        int intArray1[];    //declaring array
        intArray1 = new int[num1];  // allocating memory to array
        
     // accessing the numbers in the second line
        for (int i = 0; i < intArray1.length; i++){
        	intArray1[i] = in.nextInt();
        }
        
        int num2 = in.nextInt();
        int intArray2[];    //declaring array
        intArray2 = new int[num2];  // allocating memory to array
        
     // accessing the numbers in the second line
        for (int i = 0; i < intArray2.length; i++){
        	intArray2[i] = in.nextInt();
        }
        
        int res = binarySearch(intArray1, intArray2);

        System.out.println(res);
        in.close();
    }
}
