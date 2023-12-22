

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] a) throws IOException{

//    	for(int i=1; i<=9; i++) {
//    		for (int j=1; j<=9; j++) {
//    			System.out.println(i + "x" + j + "=" + (i*j));
//    		}
//    	}

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            String line1 = br.readLine();
            int N = Integer.parseInt(line1);

            for (int i=0; i<N; i++) {
            	String line = br.readLine();
            	String[] tmp = line.split(" ");
            	int[] tri = {Integer.parseInt(tmp[0]), Integer.parseInt(tmp[1]),Integer.parseInt(tmp[2])};


            	if (pitagoras(tri[0], tri[1], tri[2])
            			|| pitagoras(tri[1], tri[2], tri[0])
            			|| pitagoras(tri[2], tri[0], tri[1]) ) {

            		System.out.println("YES");
            	} else {
            		System.out.println("NO");
            	}

            }
        }


    }


    private static boolean pitagoras(int a, int b, int c) {
    	return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) ? true : false;
    }
}