//Volume0-0031
import java.util.Scanner;

class Main {

    public static void main(String[] arg){

        //declare
    	int       n,w;
    	boolean   flg;
    	boolean[] table;

        //input
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	n = sc.nextInt();

        	//calculate
        	table = new boolean[10];
        	w = 512;
        	for(int i=9;i>=0;i--){
        		if(n - w >= 0){
        			n -= w;
        			table[i] = true;
        		}
        		w/=2;
        	}

        	//output
        	flg = false;
        	for(int i=0;i<10;i++){
        		if(table[i]){
        			if(flg){
        				System.out.print(" ");
        			}
        			System.out.print((int)Math.pow(2,i));
        			flg = true;
        		}
        	}
        	System.out.println();
        }
    }
}