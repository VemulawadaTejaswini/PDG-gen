import java.util.Scanner;

public class Main{
    Main(){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){
	    int n = sc.nextInt(), mx, mn;
	    if(n == 0) break;
	    mx = mn = -1;

	    for(int j = 0; j < n; j++){
		int tmp = 0;
		for(int i = 0; i < 5; i++)
		    tmp += sc.nextInt();
		if(mx == -1 || mx < tmp) mx = tmp;
		if(mn == -1 || mn > tmp) mn = tmp;
	    }

	    System.out.println(String.valueOf(mx) + " " + String.valueOf(mn));
	}
    }

    public static void main(String[] args){
	new Main();
    }
}