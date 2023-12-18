import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Z=0;
	    int pri[]=new int[205];
	    pri[0]=300000;
	    pri[1]=200000;
	    pri[2]=100000;
	    for(int i=3;i<205;i++){
	        pri[i]=0;
	    }
	    int X = sc.nextInt();
		int Y = sc.nextInt();
	    for(int i=0;i<205;i++){
	        if(i+1==X)Z+=pri[i];
	    }
	    for(int j=0;j<205;j++){
	        if(j+1==Y)Z+=pri[j];
	    }
	    if(X==1&&Y==1){
	        Z+=400000;
	    }
	    System.out.println(Z);

	}

}
