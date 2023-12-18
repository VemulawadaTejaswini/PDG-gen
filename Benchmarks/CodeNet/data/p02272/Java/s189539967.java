import java.util.*;
import java.io.*;

public class Main{
    static int SENTINEL=1000000001;
    static int cnt=0;
    public static void main (String args[]){


      
        //初期処理
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        String[] sElementArray=sc.nextLine().split(" ");
        int[] array=Arrays.stream(sElementArray).mapToInt(Integer::parseInt).toArray();
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //    try{
    //         n= Integer.parseInt(br.readLine());
    //         sElementArray = br.readLine().split(" ");
    //         array = Arrays.stream(sElementArray).mapToInt(Integer::parseInt).toArray();
    //     }catch(IOException e){e.printStackTrace();}

            mergeSort(array,n,0,n);
            String[] ss=Arrays.stream(array).mapToObj(Integer::toString).toArray(s->new String[s]);
            String str=String.join(" ",ss);
            System.out.println(str);
            System.out.println(cnt);
        
    }

    public static void mergeSort (int[] array,int n,int left,int right){
        if(left+1<right){
            int mid=(right+left)/2;
            
            mergeSort(array, n, left, mid);
            mergeSort(array, n, mid, right);
            merge(array,n,left,mid,right);
        }
    }
    
    public static void merge(int[] array,int n,int left,int mid,int right){
        int n1=mid-left;
        int n2=right-mid;
        int[] L = new int[n1+1];
        int[] R = new int[n2+1];

        for(int i=0;i<n1;i++){L[i]=array[left+i];}
        for(int i=0;i<n2;i++){R[i]=array[mid+i];}
        L[n1]=SENTINEL;
        R[n2]=SENTINEL;

        int i=0;
        int j=0;
        for(int k=left;k<right;k++){
            if(L[i]<=R[j]){
                array[k]=L[i];
                i++;
            }else if(L[i]>R[j]){
                array[k]=R[j];
                j++;
            }
            cnt++;
        }

    }
}

