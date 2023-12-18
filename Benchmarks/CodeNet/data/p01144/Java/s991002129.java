import java.util.*;

public class Main{
    int n,m;
    int[] d,p;

    public static void main(String[] args){
	new Main().solve();
    }

    void solve(){
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	while(n!=0){
	    m = sc.nextInt();
	    d = new int[n];
	    p = new int[n];
	    for(int i=0 ;i<n; i++){
		d[i] = sc.nextInt();
		p[i] = sc.nextInt();
	    }

	    //ツ甘コツ妥陳値ツつェツ妥・ツつォツつ「ツ渉?づ可陛?づ堕妥鳴つヲ
	    for(int i=0; i<n; i++){
		int max = 0;
		int maxIndex = 0;
		for(int j=i; j<n; j++){
		    if(max<p[i]){
			max = p[i];
			maxIndex = i;
		    }
		}
		int tmp = p[maxIndex];
		p[maxIndex] = p[i];
		p[i] = tmp;
		tmp = d[maxIndex];
		d[maxIndex] = d[i];
		d[i] = tmp;
	    }

	    int i=0;
	    while(m>0){
		while(d[i]>0 && m>0){
		    d[i]--;
		    m--;
		}
		i++;
		if(i>=n)break;
	    }

	    long ans = 0;
	    for(i=0; i<n; i++){
		if(d[i]>0){
		    ans += d[i]*p[i];
		}
	    }

	    System.out.println(ans);

	    n = sc.nextInt();
	}
    }
}