import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int [4];
		int b[] = new int [4];		
		while(sc.hasNext()){
			int hit = 0;
			int blow = 0;
			for(int i = 0; i<4;i++){
				a[i]=sc.nextInt();
			}
			for(int i = 0; i<4;i++){
				b[i]=sc.nextInt();
			}
			
			for(int i = 0; i<4; i++){
				for(int  c = 0; c<4; c ++){
					if(i == c){
						if(a[i]==b[c]){
							blow ++ ;
						}
					}else{
						if(a[i]==b[c]){
							hit++;
						}
					}
				}
			}
			System.out.println(hit+" "+blow);
		}
	}
}