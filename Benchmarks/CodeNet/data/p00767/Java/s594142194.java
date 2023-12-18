import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

	while (true) {

		Scanner sc = new Scanner(System.in);
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
    	//System.out.println(h + " " + w);

        if (h == 0 && w == 0) {
        	break;
        }

        int min[] = new int[100];
    	int size = (h*h)+(w*w);


    	for (int i=1; i < h+1; i++) {


    		for (int j=w; j<=150; j++) {
    			int taikaku = (i*i)+(j*j);



    			if (taikaku > size) {

    				min[i] = taikaku;

    				break;
    			}

    		}

    	}


    	int win = 20000;
    	int yoko = 0;
    	int tate = 0;
    	for (int i=1; i < h+1; i++) {
    		if(win > min[i] ) {
    			win = min[i];


    			yoko = win - (i*i);

    			tate = i;
    		}

    	}
    	yoko = (int)Math.sqrt(yoko);

    	int min2=20000;
    	if (h+1 < w ) {
    	 min2 = ((h+1)*(h+1)) + (w*w);

    	}

    	if (min2 < win ) {

    		System.out.println(h+1+" " +w);

    	}else{
    		System.out.println(tate+" " +yoko);
    	}










	}
}
}

