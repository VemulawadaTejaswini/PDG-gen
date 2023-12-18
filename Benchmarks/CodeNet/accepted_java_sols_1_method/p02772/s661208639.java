import java.util.*;

public class Main {
	public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

        int d =0;
		int[]list  = new int[N];
		for(int i=0; i<N; i++){
			list[i] = sc.nextInt();
			if(list[i] % 2 == 0 && list[i] % 3 != 0 && list[i] % 5 != 0) {
             d++;   
			}			    
}
			if(d>0){
				System.out.println("DENIED");
			}else{
        		System.out.println("APPROVED");
}
}
}
