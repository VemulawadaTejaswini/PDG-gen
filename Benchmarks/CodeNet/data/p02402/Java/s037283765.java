import java.util.Scanner;
class Main{
	Scanner sc = new Scanner(System.in);
	int n;
	int[] m;
	int min=999999;
	int max=0;
	int sum;
	
	void input(){
		n = sc.nextInt();
		m = new int[n];
		
		for (int i=0; i<n; i++) {
			m[i] = sc.nextInt();
			if (max < m[i]) {	
				max = m[i];	
			}
			if (min > m[i]) {	
				min = m[i];	
			}
			
			sum=sum+m[i];
			
		}
			
		    
			
			
    }
				
  	void output(){
			System.out.print(min);
			System.out.print(" ");
			System.out.print(max);
			System.out.print(" ");
			System.out.println(sum);
			
  	}
	public static void main(String[]agrs){
		Main cp4 =new Main();
		cp4.input();
		cp4.output();
	}
}