import java.util.Scanner;


public class Main {

	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();
		int q = stdIn.nextInt();
        String [] a = new String[n];
        int [] b = new int[n];
        String [] aa = new String[n];
        int [] bb = new int[n];

        for(int i = 0; i < n; i++){
        	a[i] = stdIn.next();
        	b[i] = stdIn.nextInt();
        }
        stdIn.close();

    	int index =0;
    	int basictime=0;
        int ansIndex=0;
        while(true) {
        	if(b[index]==0) {
        		index++;
            	if(index==n){
            		//初期値へ
            		index=0;
            	}
        		continue;
        	}
        	int remaining =b[index]-q;
        	if(remaining >0){
        		b[index] = remaining;
        		basictime+= q;
        	} else {
        		b[index] = 0;
        		aa[ansIndex]=a[index];
        		bb[ansIndex]=q + basictime + remaining;
        		ansIndex++;
        		basictime+= q + remaining;
        		//全チェックし、全てMapにあれば終了
        		if(ansIndex==n){
        			break;
        		}
        	}
        	index++;
        	if(index==n){
        		//初期値へ
        		index=0;
        	}
        }
        for(int i = 0; i < ansIndex; i++){
        	System.out.println(aa[i] + " " + bb[i]);
        }
    }
}

