import java.util.Scanner;

public class Main{
    int[] mny = {100, 500, 1000};

    Main(){
	Scanner sc = new Scanner(System.in);
	int[] res = new int[3];

	while(sc.hasNext()){
	    int a = sc.nextInt(), b = sc.nextInt();
	    if(a+b == 0) break;
	    b -= a;

	    for(int i = 2; i >= 0; i--){
		res[i] = b/mny[i];
		b %= mny[i];
	    }

	    System.out.print(Integer.toString(res[0]));
	    for(int i = 1; i < 3; i++)
		System.out.print(" "+Integer.toString(res[i]));
	    System.out.println();
	}
    }

    public static void main(String[] args){
	new Main();
    }
}