
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	static long changecount = 0;
   public static void main(String args[]) throws IOException{


	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int n = Integer.parseInt( br.readLine()  );
       Heap[] heaps = new Heap[n];

	   String[] string =  br.readLine().split(" ");

       for(int i = 0 ; i < n ; i++){
    	   heaps[i] = new Heap(i+1,  Integer.parseInt(string[i] ) );
       }


       for(int i = 0 ; i < n ; i++){
            heaps[i].print();
            int I = heaps[i].index/2;
            int Left = 2*heaps[i].index;
            int Right = 2*heaps[i].index + 1;

            if( 1 <= I ){
            	System.out.print( " parent key = "+heaps[I-1].key+ ",");
            }
            if( Left <= n ){
            	System.out.print( " left key = "+heaps[Left-1].key+ ",");
            }
            if( Right <= n ){
            	System.out.print( " right key = "+heaps[Right-1].key+ ",");
            }
            System.out.println();
       }




   }


}



class Heap{

	int  key;
    int index;
    Heap(int i,  int x) {
        key = x;
        index = i;
    }

    void print(){

    	System.out.print(" node "+index+": key = " +key+ ",");
    }


}