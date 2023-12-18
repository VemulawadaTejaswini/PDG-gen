import java.util.Scanner;
public class Main{
    public static void main(String[]args){
	int i,j,kazu,csosu=0;
	Scanner sc = new Scanner(System.in);
	    i=sc.nextInt();
	for(j=0;j<i;j++){
	    kazu=sc.nextInt();
	    csosu+=sosu(kazu); 
	}
	System.out.println(csosu);
    }
    static int sosu(int x){//return 0(not) or 1(sosu)
	int c;
	for(c=x/2;c>1;c--){
	    if(x%c==0){
		return 0;
	    }
	}
	return 1;
    }
}

