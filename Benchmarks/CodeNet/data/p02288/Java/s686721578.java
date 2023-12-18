import java.util.*;
import java.io.*;

public class Main{

    static int negativeInf = -Integer.MIN_VALUE;
    public static void main (String args[]){
        //初期処理
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        String[] sElementArray=sc.nextLine().split(" ");
        //int[] array=Arrays.stream(sElementArray).mapToInt(Integer::parseInt).toArray();
        int[] array=new int[n+1];
        for(int i=0;i<n;i++){
            array[i+1]=Integer.parseInt(sElementArray[i]);
        }
        array[0]=negativeInf;
        sc.close();

        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //    try{
        //         int n= Integer.parseInt(br.readLine());
        //         int[] array = Arrays.stream(sElementArray).mapToInt(Integer::parseInt).toArray();
                
        //     }catch(IOException e){e.printStackTrace();}


        buildMaxHeap(array);

        for (int i=1;i<=n;i++){
            System.out.print(" "+array[i]);
        }
        System.out.print("\n");

    }

    static void buildMaxHeap(int[] array){
        for(int i=(array.length-1)/2;i>=1;i--){
            maxHeapify(i, array);
        }
    }
    
    //return index of each node
    static int parent(int h){return h/2;}
    static int left(int h){return 2*h;}
    static int right(int h){return 2*h+1;}

    static void maxHeapify(int k,int[] array){
        int indexOfLargestKey=k;
        int l=0;
        int r=0;
        if(2*k<array.length){
            l=left(k);
        }
        if(2*k+1<array.length){
            r=right(k);
        }
        
        if(array[indexOfLargestKey]<array[l]){
            indexOfLargestKey=l;
        }
        if(array[indexOfLargestKey]<array[r]){
            indexOfLargestKey=r;
        }

        if(array[indexOfLargestKey] != array[k]){
            swap(array,indexOfLargestKey,k);
            maxHeapify(indexOfLargestKey, array);
        }
    }

    static void swap(int[] array,int n,int m){
        int tmp=array[n];
        array[n]=array[m];
        array[m]=tmp;
    }
}
    
