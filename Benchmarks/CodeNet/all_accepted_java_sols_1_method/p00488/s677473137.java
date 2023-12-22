import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m[] = new int[5];
		int minP = 2001,minJ = 2001;
		
		for(int i=0; i<5; i++){
			m[i] =s.nextInt(); 	
		}
		
		for(int i=0; i<5; i++){
			if(i < 3){
				if(m[i] < minP)	minP = m[i];
			}
			else{
				if(m[i] < minJ)	minJ = m[i];
			}
		}
		
		System.out.println(minP + minJ -50);

	}

}