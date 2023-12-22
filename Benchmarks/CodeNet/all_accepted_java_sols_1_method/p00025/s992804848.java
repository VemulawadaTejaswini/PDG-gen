import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int[] a = new int[4];
			int hit = 0;
			int blow = 0;
			for(int i=0;i<4;i++){
				a[i] = sc.nextInt();
			}
			for(int i=0;i<4;i++){
				int b = sc.nextInt();
				for(int j=0;j<4;j++){
					if(b==a[j]){
						if(j==i){
							hit++;
						}else{
							blow++;
						}
						j=4;
					}
				}
			}
			System.out.println(hit + " " + blow);
			
		}

	}
}