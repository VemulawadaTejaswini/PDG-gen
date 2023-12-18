import java.util.*;

class Main{

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	int p = sc.nextInt();

	while(n!=0 && p!=0){
	    int[] mayor = new int[n];
	    int pp = p;
	    int winner = 0;
	    for(int i=0;;){
		if(pp!=0){
		    mayor[i]++;
		    pp--;
		    if(mayor[i]==p){winner = i; break;}
		}else if(pp==0){
		    pp = mayor[i];
		    mayor[i] = 0;
		}
		i = (i+1)%n;
	    }

	    System.out.println(winner);

	    n = sc.nextInt();
	    p = sc.nextInt();
	}
    }
}