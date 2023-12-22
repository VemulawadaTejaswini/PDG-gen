import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] a = new int[4];
        for(int i =0; i<4; i++)
        { a[i] = sc.nextInt();}
		int e = sc.nextInt();
		int k = sc.nextInt();
		sc.close();
		for(int i =0; i<4; i++)
        {if(e-a[i]>k) 
        {System.out.println(":(");
        System.exit(0);}
        }
		
		System.out.println("Yay!");
        
	}

}
