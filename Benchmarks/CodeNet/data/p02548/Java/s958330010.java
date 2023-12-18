import java.util.*;
class Main {
	static Integer sup[]=new Integer[10000001];
	static void sol(){
		int i,j;
		for(i=0;i<10000001;i++)
		sup[i]=i;
		for(i=4;i<10000001;i+=2)
		sup[i]=2;
		for(i=3;i*i<10000001;i++){
			if(sup[i]==i){
				for(j=i*i;j<10000001;j+=i){
					if(sup[j]==j)sup[j]=i;
				}
			}
		}
	}
	static int nofac(int n){
	    if(n==1)return 1;
	    int ans = 1;
	    int y = sup[n];
	    int cnt = 1;
	    int j = n / y;
	    while (j != 1) {
	        if (sup[j] == y)
	            cnt ++;
	        else {
	            y = sup[j];
	            ans = ans*(cnt + 1);
	            cnt = 1;
	        }
	        j = j / sup[j];
	    }
	    ans = ans *(cnt + 1);
	    return ans;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sol();
		int ans=0;
        for(int i=1;i<=n-1;i++){
            ans+=nofac(n-i);
        }
        System.out.println(ans);

	}

}
