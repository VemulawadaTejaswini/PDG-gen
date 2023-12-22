import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int k=0,c=0;

	while(sc.hasNext()){
	    k = sc.nextInt();
	    if(k==0) break;

	    for(int i = 0;i<k*(k-1)/2;i++) c += sc.nextInt();
	    
	    System.out.println(c/(k-1));
	    c = 0;
	}
    }
}