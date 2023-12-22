import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			int sumA=0;
			for(int i=0;i<4;i++){
				sumA += sc.nextInt();
			}
			int sumB=0;
			for(int i=0;i<4;i++){
				sumB += sc.nextInt();
			}
			if(sumA>sumB){
				System.out.println(sumA);
			}else{
				System.out.println(sumB);
			}
						
		}
	}
}