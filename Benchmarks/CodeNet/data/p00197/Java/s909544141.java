import java.util.Scanner;

public class Main{
    void euc(int n, int m){
	int x, y, z, t = 0;
	if(n < m){
	    x = m;
	    y = n;
	} else {
	    x = n;
	    y = m;
	}

	while(y > 0){
	    x %= y;
	    z = y;
	    y = x;
	    x = z;
	    t++;
	}
	System.out.println(String.valueOf(x)+ " " + String.valueOf(t));

	return ;
    }

    Main(){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){
	    int n = sc.nextInt(), m = sc.nextInt();
	    if(n+m == 0) break;

	    euc(n, m);
	}
    }

    public static void main(String[] args){
	new Main();
    }
}