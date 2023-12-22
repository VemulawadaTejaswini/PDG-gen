import java.util.Scanner;
import java.util.Arrays;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int array[]=new int[n];
        for(int i=0; i<n; i++){
            array[i]=sc.nextInt();
        }

        Arrays.sort(array);

        for(int j=0; j<n-1; j++){
            if(array[j]-array[j+1]==0){
                System.out.println("NO");
                break;
            }
            if(j==n-2){
                System.out.println("YES");
            }    
        }
        sc.close();
    }
}	