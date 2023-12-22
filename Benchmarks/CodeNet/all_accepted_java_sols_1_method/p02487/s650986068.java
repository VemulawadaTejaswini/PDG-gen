import java.util.Scanner;
public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int h = 1;
	int w = 1;
	while(0 < h && 0 < w && h < 301 && w < 301){
	    h = sc.nextInt();
	    w = sc.nextInt();
	    if(h == 0 && w == 0){
		break;
	    }
	    for(int j = 0; j < w; j++){
		System.out.printf("#");
	    }
	    System.out.println("");
	    for(int i = 0; i < h-2; i++){
		System.out.printf("#");
		for(int j = 0; j < w-2; j++){
		    System.out.printf(".");
		}
		System.out.println("#");
	    }
	    for(int j = 0; j < w; j++){
		System.out.printf("#");
	    }
	    System.out.println("");
	    System.out.println("");
	}
    }
}