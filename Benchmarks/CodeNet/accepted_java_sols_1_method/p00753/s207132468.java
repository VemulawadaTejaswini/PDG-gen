import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = 0,count = 0;
	boolean check = true;

	while(sc.hasNext()){
	    n = sc.nextInt();
	    count = 0;//テ・ツ按敕ヲツ慊淌・ツ個?
	    check = true;

	    if(n==0) break;

	    for(int i = n+1;i<=2*n;i++){
		check = true;
		for(int j = 2;j*j<=i;j++){
		    if(i%j == 0) check = false;
		}
		
		if(check) count++;
	    }

	    System.out.println(count);
	}

    }
}