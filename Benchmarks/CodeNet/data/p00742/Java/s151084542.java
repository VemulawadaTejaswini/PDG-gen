
import java.util.Scanner;

public class Main {
	String alplis[]={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().solve();
	}
	
	void solve(){
//		System.out.println("tes");
		Scanner sc=new Scanner(System.in);
		String[] txt;
		
		while(true){
			int n=sc.nextInt();
			if(n==0)break;
			txt=new String[n];
			int maxx=0;
			for(int i=0;i<n;i++){
				txt[i]=sc.next();
				if(i!=n-1)maxx=Math.max(maxx, txt[i].length());
			}
			if(maxx>txt[n-1].length()){
				System.out.println(0);
				continue;
			}
			maxx=txt[n-1].length();
			int alpb[]=new int[alplis.length];
			for(int i=0;i<alpb.length;i++){
				alpb[i]=-1;
			}
			int number[][]=new int[n][maxx];
			for(int i=0;i<number.length;i++){
				for(int j=0;j<number[0].length;j++){
					number[i][j]=-1;
				}
			}
			int nn=0;
			for(int j=0;j<txt.length;j++){
				String t=txt[j];
				for(int i=0;i<t.length();i++){
					String s=t.substring(i, i+1);
					for(int k=0;k<alplis.length;k++){
						if(s.equals(alplis[k])){
							if(alpb[k]==-1){
								alpb[k]=nn;
								nn++;
							}
							number[j][i]=alpb[k];
						}
					}
				}
			}
			
			int numset[]=new int[nn];
			for(int i=0;i<numset.length;i++){
				numset[i]=i;
			}
			
			int ans=0;
			while(true){
				int sum=0;
				boolean bbb=false;
				for(int i=0;i<number.length;i++){
					if(numset[number[i][0]]==0&&number[i][1]!=-1){
						numset=nextnum(numset);
						bbb=true;
						break;
					}
					if(i==number.length-1)continue;
					int l=1;
					for(int j=number[0].length-1;j>=0;j--){
						if(number[i][j]!=-1){
							sum+=numset[number[i][j]]*l;
							l*=10;
						}
					}
				}
				if(bbb)continue;
				int l=1;
				int summ=0;
				for(int j=number[0].length-1;j>=0;j--){
					if(number[number.length-1][j]!=-1){
						sum-=numset[number[number.length-1][j]]*l;
						summ+=numset[number[number.length-1][j]]*l;
						l*=10;
					}
				}
				if(sum==0){
//					System.out.println(summ1+"+"+summ2+"="+summ);
/*					////////
					for(int i=0;i<number.length;i++){
						sum=0;l=1;
						for(int j=number[0].length-1;j>=0;j--){
							if(number[i][j]!=-1){
								sum+=numset[number[i][j]]*l;
								l*=10;
							}
						}
						System.out.print(sum);
						if(i<number.length-2){
							System.out.print("+");
						}else{
							if(i!=number.length-1)System.out.print("=");
						}
					}
					System.out.println();
*/					////////
					ans++;
				}
				numset=nextnum(numset);
				if(numset[0]==10)break;
			}
			System.out.println(ans);
		}
	}
	
	int[] nextnum(int[] n){
		while(true){
			n[n.length-1]++;
			for(int i=n.length-1;i>=0;i--){
				if(n[i]==10&&i!=0){
					n[i]=0;
					n[i-1]++;
				}
			}
			boolean t=false;
			for(int i=0;i<n.length-1;i++){
				for(int j=i+1;j<n.length;j++){
					if(n[i]==n[j]){
						t=true;
						break;
					}
				}
				if(t)break;
			}
			if(!t)break;
		}
		return n;
	}

}