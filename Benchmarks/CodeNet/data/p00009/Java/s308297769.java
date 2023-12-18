import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner s = new Scanner(System.in);
		
		while(s.hasNext()){
			
			int n = s.nextInt();
			int ptr =0;
			
			int[] prime = new int[10000];
			
			if(n>1){
				prime[ptr] = 2;
ptr++;
			}
			if(n>2){
				prime[ptr] = 3;
ptr++;
				for(int i = 5; i<= n ;i+=2){
					boolean check = true;
					int j;
					for(j = 1;j< ptr;j++){
						if(i % prime[j] == 0){
							
							break;
						}
						
					}
					if(j == ptr){
						//prime[ptr] = i;
ptr++;
					}

				}
			}
			
			System.out.println(Integer.toString(ptr));

		}
	}
}