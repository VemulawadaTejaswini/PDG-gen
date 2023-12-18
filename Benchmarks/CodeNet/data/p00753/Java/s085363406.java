import java.util.*;
class Main{
    public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	while(n > 0){
	    int count = 0;
	    for(int i=n;i<2*n;i++){
		if(isSosu(i)) count++;
	    }
	    System.out.println(count);
	    n = sc.nextInt();
	}
    }
    static boolean isSosu(int n){
	for(int i = 2; i<n; i++){
	    if(n % i == 0) return false;
	}
	return true;
    }
}