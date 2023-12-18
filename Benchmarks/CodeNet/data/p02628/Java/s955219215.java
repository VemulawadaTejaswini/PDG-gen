
public class MixJuice {
	int n;
	int k;
	int ans;

	MixJuice(int n,int k,int [] p){
		this.n=n;
		this.k=k;
		int min[]=new int [k];

		for(int i=0;i<n;i++) {

			for(int j=0;j<k;j++) {
				if(p[i]==-1) {

				}else if(min[j]==0) {
					min[j]=p[i];
					p[i]=-1;
				}else if(min[j]>p[i]) {

					for(int l=k-1;l>j;l--) {
						int g=min[l-1];
						min[l]=g;  //min[k-0]～min[j+1]=min[k-1]～min[j]
					}
					min[j]=p[i];
					p[i]=-1;
				}

			}

		}


		this.ans=0;
			for(int i=0;i<k;i++) {
				this.ans+=min[i];
			}
	}



}
