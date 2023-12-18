import java.util.Scanner;

public class Main {
	
	static int linearsSearch(int[] a, int[] b) {
		int counter = 0;
		for(int i=0; i<b.length; i++)
		{			
			for(int j=0; j<a.length; j++)
			{
				if(b[i]==a[j])
				{
					counter++;
					break;
				}					
			}			
		}
		return counter;
	}
	
    public static void main(String argv[]) {

        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
//        System.out.println(num1);

        int intArray1[];    //declaring array
        intArray1 = new int[num1];  // allocating memory to array
        
     // accessing the numbers in the second line
        for (int i = 0; i < intArray1.length; i++){
        	intArray1[i] = in.nextInt();
//        	System.out.println(intArray1[i]);
        }
        
        int num2 = in.nextInt();
//        System.out.println(num2);

        int intArray2[];    //declaring array
        intArray2 = new int[num2];  // allocating memory to array
        
     // accessing the numbers in the second line
        for (int i = 0; i < intArray2.length; i++){
        	intArray2[i] = in.nextInt();
//        	System.out.println(intArray2[i]);
        }        
        int res = linearsSearch(intArray1, intArray2);
        System.out.println(res);
        in.close();
    }
}

