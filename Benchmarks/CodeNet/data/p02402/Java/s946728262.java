//Computation - Min, Max and Sum
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String n =in.readLine();
		String[] a = in.readLine().split(" ");
		
		int min=-1000000;
		int max=1000000;
		int sum=0;
		
		for(int i=0;i<a.length;i++){
			
			if(Integer.parseInt(a[i])<min){
				min =Integer.parseInt(a[i]); 
			}
			
			if(Integer.parseInt(a[i])>max){
				max =Integer.parseInt(a[i]); 
			}
			
				sum += Integer.parseInt(a[i]); 
			
		}
		
		System.out.println(min + " " + max + " " +sum);

	}
}