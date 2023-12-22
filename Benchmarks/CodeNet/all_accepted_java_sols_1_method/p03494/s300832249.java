import java.util.*;
public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int []hairetu= new int[N];
		int []hairetu2=new int[N];
		int count=0;
		for(int i=0;i<N;i++) {
			hairetu[i]=sc.nextInt();
			}
		for(int i=0;i<N;i++) {
			while(hairetu[i]%2==0){
				hairetu[i]=hairetu[i]/2;
			count++;
			}
			hairetu2[i]=count;
			count=0;
			}
		int min = hairetu2[0];
		for(int i=0;i<N;i++) {
			if(min>hairetu2[i]){
				min = hairetu2[i];
			}
		}
			System.out.println(min);
		}
	
		}
	
