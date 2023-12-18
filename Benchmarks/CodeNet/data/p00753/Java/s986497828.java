import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		List<Integer> n=new ArrayList<Integer>();
		List<Integer> dat=new ArrayList<Integer>();
		int a=0;

		while(true){
			int ans=0;
			int flg=0;
			n.add(scn.nextInt());
			if(n.get(a)==0)break;

			for(int i=1;i<n.size()-1;i++){
				if(n.get(a)==n.get(i)){
					dat.add(dat.get(i));
					a++;
					flg=1;
					break;
				}
			}
			if(flg==1)continue;

			for(int i=n.get(a)+1;i<=2*n.get(a);i++){
				for(int j=2;j<=i;j++){
					if(j>=i/2){
						ans++;
						break;
					}
					if(i%j==0)break;
				}
			}
			dat.add(ans);
			a++;
		}
		for(int i=0;i<dat.size();i++){
			System.out.println(dat.get(i));
		}
	}
}