import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int List[]= new int[10000];
		int s=0,n=0;
		for(int i =0;i<10000;i++){
			List[i]=0;
		}
		n=scan.nextInt();
		for(int i=0;i<n;i++){
			List[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++){
			for(int j=i;0<=j;j--){
				if(j<i && List[j]<=List[i]){
					if(s<List[j]){
						s=List[j];
					}
				}
			}
		}
		System.out.println(s);
	}
}