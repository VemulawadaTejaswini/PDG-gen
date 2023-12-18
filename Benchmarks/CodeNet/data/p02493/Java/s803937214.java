import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int [] data = new int [n];
		int work;
		
		for(int i=0 ; i<n; i++){
			data[i]=sc.nextInt();
		}
		
		if(n%2!=0){
			for(int i=0; i<n/2; i++){
				work = data[i];
				data[i]=data[n-1-i];
				data[n-1-i]=work;
			}
			
		}else{
			for(int i=0; i<n/2; i++){
				work = data[i];
				data[i]=data[n-1-i];
				data[n-1-i]=work;
			}
		}
		
		for(int i = 0; i<n; i++){
			System.out.print(data[i]+" ");
		}
	}
}