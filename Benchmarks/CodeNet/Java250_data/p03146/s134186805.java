import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		
		List <Integer> L =  new ArrayList <Integer>();
		
		int temp = A;
		int i = 1;
		
		while (L.contains(temp)!=true){
			L.add(temp);
			
			if (temp%2==0)
				temp/=2;
			else
				temp = temp*3+1;
	
			i++;
		}
		
		System.out.println(i);
		sc.close();
	}

}
