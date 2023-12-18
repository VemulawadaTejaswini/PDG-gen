import java.util.*;
import java.io.*;

public class Main{

    static int negativeInf = Integer.MIN_VALUE;
    public static void main (String args[]){
        //初期処理
        // Scanner sc=new Scanner(System.in);
        // int n=Integer.parseInt(sc.nextLine());
        // String[] sElementArray=sc.nextLine().split(" ");
        // //int[] array=Arrays.stream(sElementArray).mapToInt(Integer::parseInt).toArray();
        // int[] array=new int[n+1];
        // for(int i=0;i<n;i++){
        //     array[i+1]=Integer.parseInt(sElementArray[i]);
        // }
        // array[0]=negativeInf;
        // sc.close();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           try{
                //int n= Integer.parseInt(br.readLine());
                //int[] array = Arrays.stream(sElementArray).mapToInt(Integer::parseInt).toArray();
                ArrayList<Integer> heapArray=new ArrayList<Integer>();
                heapArray.add(negativeInf);//0番目は使わないので埋める

                while( true ){
                    String[] sArray=br.readLine().split(" ");
                    if(sArray[0].equals("insert")){
                        int number = Integer.parseInt(sArray[1]);
                        insert(heapArray,number);
                    }
                    if(sArray[0].equals("extract")){
                        int ans = extract(heapArray);
                        System.out.println(ans);
                    }
                    if(sArray[0].equals("end")){
                        break;
                    }
                    
                }
                
            }catch(IOException e){e.printStackTrace();}



        

    }

    static void buildMaxHeap(ArrayList<Integer> array){
        for(int i=(array.size()-1)/2;i>=1;i--){
            maxHeapify(i, array);
        }
    }
    
    //return index of each node
    static int parent(int h){return h/2;}
    static int left(int h){return 2*h;}
    static int right(int h){return 2*h+1;}

    static void maxHeapify(int k,ArrayList<Integer> array){
        int indexOfLargestKey=k;
        int l=0;
        int r=0;
        if(2*k<array.size()) {
            l=left(k);
        }
        if(2*k+1<array.size()){
            r=right(k);
        }
        
        if(array.get(indexOfLargestKey)<array.get(l)){
            indexOfLargestKey=l;
        }
        if(array.get(indexOfLargestKey)<array.get(r)){
            indexOfLargestKey=r;
        }

        if(array.get(indexOfLargestKey) != array.get(k)){
            swap(array,indexOfLargestKey,k);
            maxHeapify(indexOfLargestKey, array);
        }
    }

    static void swap(ArrayList<Integer> array,int n,int m){
        int tmp=array.get(n);
        array.set(n, array.get(m));
        array.set(m, tmp);
    }

    static void insert(ArrayList<Integer> heapArray,int number){
        heapArray.add(number);
        //buildMaxHeap(heapArray);
        int k=heapArray.size()-1;
        while(parent(k)>=1 && heapArray.get(k)>heapArray.get(parent(k))){
            swap(heapArray,k,parent(k));
            k=parent(k);
        }
    }

    static int extract(ArrayList<Integer> heapArray){
        int popedNumber =heapArray.get(1);
        int h = heapArray.size()-1;
        heapArray.set(1,heapArray.get(h));
        heapArray.remove(h);
        maxHeapify(1, heapArray);
        return popedNumber;
    }
}
    
