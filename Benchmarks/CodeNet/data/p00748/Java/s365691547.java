import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int[] tetra = new int[200];
    int[] Otetra = new int[200];
    int[] ans = new int[1000000];
    int[] odd = new int[1000000];

    void run(){
	setTetra();
	solve();
	while(sc.hasNext()){
	    int x = sc.nextInt();
	    if(x!=0)
		System.out.println(ans[x]+" "+odd[x]);
	}
    }

    void setTetra(){
	int o = 0;
	for(int i=0; i<tetra.length; i++){
	    tetra[i] = (i*(i+1)*(i+2))/6;
	    if(tetra[i]%2==1)
		Otetra[o++] = tetra[i];
	}
    }

    void solve(){
	int max = Integer.MAX_VALUE;
	Arrays.fill(ans, max);
	Arrays.fill(odd, max);

	ans[0] = 0;
	for(int i=0; i<tetra.length; i++){
	    int a = tetra[i];
	    for(int j=a; j<ans.length; j++){
		if(ans[j-a] != max){
		    int newAns = ans[j-a]+1;
		    if(newAns < ans[j]) {
			ans[j] = newAns;	
		    }
		}
	    }
	}

	odd[0] = 0;
	for(int i=0; i<Otetra.length; i++){
	    int a = Otetra[i];
	    for(int j=a; j<odd.length; j++){
		if(odd[j-a] != max){
		    int newOdd = odd[j-a]+1;
		    if(newOdd < odd[j]) {
			odd[j] = newOdd;	
		    }
		}
	    }
	}
    }
}