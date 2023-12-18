import java.util.Scanner;

public class Main {

	public static void main(String[] args){
	    Scanner s = new Scanner(System.in);
	    int in = s.nextInt();
	    int out[] = new int[6];
	    for(int i=0 ; i<in ; i++){
		double a = s.nextDouble();
		if(a<165.0){
		    out[0]++;
		    continue;
		}if(a<170.0){
		    out[1]++;
		    continue;
		}if(a<175.0){
		    out[2]++;
		    continue;
		}if(a<180.0){
		    out[3]++;
		    continue;
		}if(a<185.0){
		    out[4]++;
		    continue;
		}else{
		    out[5]++;
		}
	    }
	    for(int i=0 ; i<6 ; i++){
		System.out.print(i+1 + ":");
		for(int j=0 ; j<out[i] ; j++)
		    System.out.print("*");
		System.out.println();
	    }

      	}
}