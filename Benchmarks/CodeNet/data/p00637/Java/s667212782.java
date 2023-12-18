import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = 0;
	boolean check = false;

	while(sc.hasNext()){
	    n = sc.nextInt();
	    if(n==0) break;

	    int[] page = new int[n];

	    for(int i = 0;i<n;i++) page[i] = sc.nextInt();

	    check = false;
	    System.out.print(page[0]);

	    for(int i = 1;i<n;i++){
		if(page[i-1]+1 != page[i]){
		    if(check){
			System.out.print("-" + page[i-1] + " " + page[i]);
			check = false;
		    }else{
			System.out.print(" " + page[i]);
		    }
		    if(i>=n-1) System.out.println();
		}else{
		    check = true;
		    if(i>=n-1) System.out.println("-" + page[i]);
		}
	    }

	}
    }
}