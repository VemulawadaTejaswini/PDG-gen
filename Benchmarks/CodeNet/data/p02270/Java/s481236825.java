import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int w[] = new int[n];
		int i, nSum=0, nMax=0;
		for(i=0; i<n; i++){
			w[i] = sc.nextInt();
			nSum+=w[i];
			if(nMax<w[i]){
				nMax=w[i];
			}
		}

		int kMin, kMinIni, kMinWok, kZan=k, nSumZan=nSum, kSho=0;
		kMinIni=nSum%k==0?nSum/k:nSum/k+1;
		if(kMinIni<nMax) kMinIni=nMax;
		kMin=kMinIni;
		while(true){
			for(i=0; i<n; i++){
				if(kMin>kSho+w[i]){
					kSho+=w[i];
				} else if(kMin==kSho+w[i]){
					kZan--;
					nSumZan-=(kSho+w[i]);
					kSho=0;
				} else {
					kMinWok=(nSumZan-kSho)%(kZan-1)==0?
						(nSumZan-kSho)/(kZan-1):
						(nSumZan-kSho)/(kZan-1)+1;
					if(kMinWok>=kSho+w[i]){
						kMin=kSho+w[i];
						kZan--;
						nSumZan-=(kSho+w[i]);
						kSho=0;
					} else{
						kZan--;
						nSumZan-=kSho;
						kSho=w[i];
					}
				}
			}
			if(kMinIni==kMin) break;
			kMinIni++;
			kMin=kMinIni;
			kZan=k;
			nSumZan=nSum;
			kSho=0;
		}
		System.out.println(kMin);
	}
}