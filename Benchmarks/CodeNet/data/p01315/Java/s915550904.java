import java.util.*;

public class Main{

    void solve(){
	Scanner sc = new Scanner(System.in);

	while(true){
	    int n = sc.nextInt();
	    if(n==0) break;

	    String[] name = new String[n];
	    double[] eff = new double[n];
	    for(int i=0; i<n; i++){
		name[i] = sc.next();
		int p = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt(), 
		    c = sc.nextInt(), d = sc.nextInt(), e = sc.nextInt(), 
		    f = sc.nextInt(), s = sc.nextInt(), m = sc.nextInt();
		double time = a+b+(c+d+e)*m;
		double income = f*m*s-p;
		eff[i] = income/time;
	    }

	    for(int i=0; i<n-1; i++){
		int maxI = i;
		for(int j=i+1; j<n; j++){
		    if(eff[j]>eff[maxI]) maxI = j;
		    else if(eff[j]==eff[maxI]){
			if(compare(name[j], name[maxI])==1) maxI = j;
		    }
		}
		String tmps = name[i];
		name[i] = name[maxI];
		name[maxI] = tmps;
		double tmpd = eff[i];
		eff[i] = eff[maxI];
		eff[maxI] = tmpd;
	    }

	    for(int i=0; i<n; i++) System.out.println(name[i]);
	    System.out.println("#");
	}
    }

    int compare(String s1, String s2){
	int len1 = s1.length();
	int len2 = s2.length();
	for(int i=0; i<Math.min(len1, len2); i++){
	    if(s1.charAt(i)<s2.charAt(i)) return 1;
	    else if(s1.charAt(i)>s2.charAt(i)) return -1;
	}
	if(len1<len2) return 1;
	else if(len1>len2) return -1;

	return 0;
    }

    public static void main(String[] args){
	new Main().solve();
    }
}