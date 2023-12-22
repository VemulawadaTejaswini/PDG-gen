import java.util.Scanner;

class Main{
    static public void main(String[] av){
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	int y = sc.nextInt();
	if(x<y){
	    int tmp = x;
	    x = y;
	    y = tmp;
	}

	int r = x % y;
	while(r!=0){
	    x = y;
	    y = r;
	    r = x % y;
	}

	System.out.println(y);
    }
}

