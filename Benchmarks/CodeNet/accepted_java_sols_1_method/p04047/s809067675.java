import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int kusim[]=new int[2*n];
		int ans=0;

		for(int i=0;i<2*n;i++){
			kusim[i]=sc.nextInt();
		}

		int turn=kusim.length-1;
		for(int j=0;j<turn;j++){
			for(int k=0;k<turn-j;k++){
				if(kusim[k]>kusim[k+1]){
					int a=kusim[k];
					kusim[k]=kusim[k+1];
					kusim[k+1]=a;
				}
			}
		}

		for(int l=0;l<n;l++){
			ans+=kusim[2*l];
		}

		System.out.println(ans);
	}

}