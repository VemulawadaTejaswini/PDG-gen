import java.util.*;

class Main{
    static int[] Tcard,Hcard;
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	int m = sc.nextInt();

	while(n!=0 && m!=0){
	    Tcard = new int[n];
	    Hcard = new int[m];
	    for(int i=0; i<n; i++){
		Tcard[i] = sc.nextInt();
	    }
	    for(int i=0; i<m; i++){
		Hcard[i] = sc.nextInt();
	    }

	    String ans = solve();

	    System.out.println(ans);

	    n = sc.nextInt();
	    m = sc.nextInt();
	}
    }

    public static String solve(){
	int Tsum = 0;
	int Hsum = 0;
	for(int i=0; i<Tcard.length; i++){
	    Tsum += Tcard[i];
	}
	for(int i=0; i<Hcard.length; i++){
	    Hsum += Hcard[i];
	}
	int Tpass = 0;
	int Hpass = 0;
	int sum = 200;
	boolean hantei = false;
	for(int i=0; i<Tcard.length; i++){
	    for(int j=0; j<Hcard.length; j++){
		if(Hsum+Tcard[i]-Hcard[j]==Tsum+Hcard[j]-Tcard[i]){
		    if(Tcard[i]+Hcard[j]<sum){
			Tpass=Tcard[i]; 
			Hpass=Hcard[j]; 
			sum=Tpass+Hpass;
			hantei = true;
		    }
		}
	    }
	}
	if(hantei)return Tpass+" "+Hpass;
	return "-1";
    }
}