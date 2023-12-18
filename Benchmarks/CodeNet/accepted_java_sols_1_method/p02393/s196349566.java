import java.util.Scanner;

public class Main {


    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a[] = new int[3], work;
    	a[0] = sc.nextInt();
    	a[1] = sc.nextInt();
    	a[2] = sc.nextInt();
    	for(int i = 0; i < 2; i++)
        	for(int j = i + 1; j < 3; j++)
        {
    			if(a[i] > a[j])
    	        {
    	            work = a[i];
    	            a[i] = a[j];
    	            a[j] = work;
    	        }
        }
        System.out.println(a[0] + " " + a[1] + " " + a[2]);
        sc.close();
    }

}