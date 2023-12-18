import java.util.Scanner;

public class Main {

	public static void main(String[] args){
	    Scanner s = new Scanner(System.in);
	    while(true){
		int[] size = new int[3];
		for(int i=0 ; i<3 ; i++)
		    size[i] = s.nextInt();
		if(size[0]==0)break;
		int num = s.nextInt();
		for(int i=0 ; i<num ; i++){
		    int a = s.nextInt()*2;
		    a*=a;
		    if(a > (size[0]*size[0] + size[1]*size[1]) || a > (size[0]*size[0] + size[2]*size[2]) || a > (size[1]*size[1] + size[2]*size[2]))
			System.out.println("OK");
		    else
			System.out.println("NA");
		}
	    }
	}
}