import java.util.Scanner;

class Main{
    public static void main(String[] args){
        int n;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		
		int a[] = new int [n];
		
		for(int i = 0;i < n;i++){
			a[n-1-i] =  scanner.nextInt();			
		} 
		
		for(int i = 0;i < n;i++){
			System.out.println(a[i]);			
		}
    	scanner.close();
    }
}