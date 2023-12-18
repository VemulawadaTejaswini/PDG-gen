import java.io.*;
class Main{
    static int heapSize;
    static long[] heapTree;

    public static void main(String[] args){
	BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
	String line = new String();

	//read Tree
	try{
	    line = bin.readLine();
	}
	catch(IOException e){
	    System.out.println("Error");
	}
	heapSize=Integer.parseInt(line);
	heapTree = new long[heapSize+1];
	heapTree[0]=-1;
	try{
	    line=bin.readLine();
	}
	catch(IOException e){
	    System.out.println("Error");
	}

	//make Tree
	String[] key = line.split(" ");
	for(int i=1; i<heapTree.length; i++){
	    heapTree[i]=Long.parseLong(key[i-1]);
	}

	//buildMaxHeap
	for(int j = (heapSize+1)/2; j>=1; j--)maxHeapify(j);

	//print
	for(int i=1; i<heapTree.length; i++){
	    System.out.print(" "+heapTree[i]);
	}
	System.out.println("");
    }
    

    static int getLeft(int i){
	return 2*i;
    }

    static int getRight(int i){
	return 2*i+1;
    }
    
    static void maxHeapify(int i){
	int l = getLeft(i);
	int r = getRight(i);
	int largest=1;

	if(l<=heapSize && heapTree[l]>heapTree[i])largest=l;
	else largest = i;
	if(r<=heapSize && heapTree[r]>heapTree[largest])largest=r;
	if(largest!=i){
	    long x = heapTree[i];
	    heapTree[i]=heapTree[largest];
	    heapTree[largest]=x;
	    maxHeapify(largest);
	}
    }
}