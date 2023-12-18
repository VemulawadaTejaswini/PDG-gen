
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    static int N;
    public static int[] Nodes;

	static long changecount = 0;
   public static void main(String args[]) throws IOException{

	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt( br.readLine()  );
	    Nodes = new int[N];


	   String[] string =  br.readLine().split(" ");

       for(int i = 0 ; i < N ; i++){
    	   Nodes[i] =  Integer.parseInt(string[i] ) ;
    	  // System.out.print("i ="+i);
       }

       //buildMaxHeap(Nodes);

       for(int i = N/2; 0 <= i ;i--){
      	// System.out.println(i);
      	 maxHeapify(i);
       }

       for(int i = 0 ; i < N ; i++){

    	   System.out.print(Nodes[i]);
    	   if(i < N-1 ){
    		   System.out.print(" ");
    	   }

       }


       System.out.println();




   }


   public static void maxHeapify(int i) {
       int left = i * 2 + 1, right = i * 2 + 2, largest;
       if (left < N && Nodes[left] > Nodes[i]) {
               largest = left;
       } else {
               largest = i;
       }
       if (right < N && Nodes[right] > Nodes[largest]) {
               largest = right;
       }

       if (largest != i) {
               int tmp = Nodes[i];
               Nodes[i] = Nodes[largest];
               Nodes[largest] = tmp;
               maxHeapify(largest);
       }
}





}



class Node{

	int  key;
    int index;
    Node(int i,  int x) {
        key = x;
        index = i;
    }

    void print(){

    	System.out.print("node "+index+": key = " +key+ ", ");
    }


}