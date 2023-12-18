import java.io.*;
import java.util.*;

public class Main{

    static int h;
    static int a[]=new int[2000000];
    
    public static void main(String args[]) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	
	while(true){
	    String str[]=br.readLine().split(" ");

	    if(str[0].equals("end"))
		break;

	    if(str[0].equals("insert")){
		insert(Integer.parseInt(str[1]));
	    }else{
		System.out.println(extract());
	    }
	}
    }

    static int extract(){
	if(h<1)
	    return Integer.MIN_VALUE;
	int max=a[1];
	a[1]=a[h--];
	maxHeapify(1);
	return max;
    }

    static void insert(int k){
	h++;
	a[h]=Integer.MIN_VALUE;
	increaseKey(h,k);
    }

    static void increaseKey(int i,int k){
	if(k<a[i])
	    return;
	a[i]=k;
	while(i>1 && a[getParent(i)]<a[i]){
	    int temp=a[getParent(i)];
	    a[getParent(i)]=a[i];
	    a[i]=temp;
	    i=getParent(i);
	}
    }

    static void maxHeapify(int i){
	    int left=getLeft(i);
	    int right=getRight(i);

	    int max=0;

	    if(left<=h && a[left]>a[i]){
		max=left;
	    }else{
		max=i;
	    }

	    if(right<=h && a[right]>a[max]){
		max=right;
	    }

	    if(max!=i){
		int temp=a[i];
		a[i]=a[max];
		a[max]=temp;
		maxHeapify(max);	
	    }
    }
    
    static int getParent(int i){
	return i/2;
    }

    static int getLeft(int i){
	return 2*i;
    }

    static int getRight(int i){
	return 2*i+1;
    }
}

