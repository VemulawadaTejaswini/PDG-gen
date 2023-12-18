import java.util.*;

class Main{
    public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();//D
	int r = sc.nextInt();//Jbgñ

	while(n!=0 && r!=0){
	    int[] fuda = new int[n+1];
	    int[] ans = new int[n+1];
	    //DÌú»
	    for(int i=1; i<n+1; i++) fuda[i] = i;
	    
	    for(int j=0; j<r; j++){
		int p = sc.nextInt();//ã©çpÔÚ
		int c = sc.nextInt();//c²«æé
		solve(fuda,ans,p,c);
	    }

	    System.out.println(ans[n]);

	    n = sc.nextInt();
	    r = sc.nextInt();
	}
    }
    
    public static void solve(int[] fuda, int[] ans, int p, int c){
	int count = 1;
	for(int k=1; k<fuda.length; k++){	 
	    //Jbg·éÍÍÉÜÜêÄ¢é©Ç¤©   
	    if(k<=fuda.length-p && k>=fuda.length-p-c+1) ans[k+p-1] = fuda[k];
	    else ans[count++] = fuda[k];	
	}
	//1ñÌJbgìªIíé½ÑÉAzñðRs[
	for(int i=0; i<ans.length; i++)	fuda[i] = ans[i];
    }

}