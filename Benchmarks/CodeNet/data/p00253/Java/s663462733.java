import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while(true){
			int N=cin.nextInt();
			if(N==0)break;
			N++;
			int[] a=new int[N];
			for(int i=0;i<N;i++){
				a[i]=cin.nextInt();
			}
			for(int i=0;i<N;i++){
				int diff=0;
				if(i>2){
					diff=a[1]-a[0];
				}
				else{
					diff=a[a.length-1]-a[a.length-2];
				}
				boolean ans=true;
				for(int j=0;j<N-1;j++){
					if(j+1!=i&&j!=i){
						if(diff!=a[j+1]-a[j]){
							ans=false;
							break;
						}
					}
					else if(j+1==i){
						if(j+2>=N)continue;
						if(diff!=a[j+2]-a[j]){
							ans=false;
							break;
						}
					}
					else if(j==i){
						
					}
				}
				
				if(ans){
					System.out.println(a[i]);
					break;
				}
				
			}
		}

	}

}