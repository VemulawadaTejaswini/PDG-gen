import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int n;
    int[] fibTri;
    
    void run(){
	calc();
	while(true){
	    n = sc.nextInt();
	    if(n==0) break;

	    int pattern = fibTri[n];;
	    int day = pattern%10==0 ? pattern/10 : pattern/10+1;
	    System.out.println(day%365==0 ? day/365 : day/365+1);
	}
    }

    void calc(){
	fibTri = new int[31];
	fibTri[0] = 0;
	fibTri[1] = 1;
	fibTri[2] = 2;
	fibTri[3] = 1+fibTri[1]+fibTri[2];
	
	for(int i=4; i<fibTri.length; i++)
	    fibTri[i] = fibTri[i-1]+fibTri[i-2]+fibTri[i-3];
    }
}