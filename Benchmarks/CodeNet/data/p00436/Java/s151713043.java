import java.util.Scanner;
class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		Main app = new Main();
		while(scan.hasNext()){
			int n = Integer.parseInt(scan.nextLine());
			int m = Integer.parseInt(scan.nextLine());
			int[] card = new int[n*2+1];
			app.setCard(card,n);
			for(int i=0;i<m;i++){
				int k = Integer.parseInt(scan.nextLine());
				if(k==0){
					app.riffleShuffle(card,n);
				}else{
					app.cut(card,n,k);
				}
			}
			for(int i=1;i<2*n+1;i++){
				System.out.println(card[i]);
			}
		}
	}
	
	public void riffleShuffle(int[] card,int n){
		int[] tmp = new int[2*n+1];
		int i;
		
		for(i=1;i<n+1;i++){
			tmp[2*i-1] = card[i];
		}
		for(i=1;i<n+1;i++){
			tmp[2*i] = card[i+n];
		}
		
		for(i=1;i<2*n+1;i++){
			card[i] = tmp[i];
		}
	}
	
	public void cut(int[] card,int n,int k){
		int[] tmp = new int[2*n+1];
		int i;
		
		for(i=1;i<k+1;i++){
			tmp[2*n-k+i] = card[i];
		}
		for(i=k+1;i<2*n+1;i++){
			tmp[i-k] = card[i];
		}
		
		for(i=1;i<2*n+1;i++){
			card[i] = tmp[i];
		}
	}
	
	public void setCard(int[] card,int n){
		for(int i=0;i<2*n+1;i++){
			card[i] = i;
		}
	}
}