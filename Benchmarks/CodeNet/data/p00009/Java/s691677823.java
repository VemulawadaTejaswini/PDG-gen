import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int p = sc.nextInt();
			int so=0;
			for(int i=2; i<=p; i++){
				int han =0;
				for(int j=2; j<=i-1; j++){
					if(i%j == 0){
						han = 1;
						break;
					}
				}
				if(han != 1){
					so++;
				}
			}
			System.out.println(so);
		}
	}
}