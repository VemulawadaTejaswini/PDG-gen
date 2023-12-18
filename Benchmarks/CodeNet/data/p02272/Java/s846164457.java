import java.io.IOException;
import java.util.*;

class Main {
    static int count;
    public static void sort(int[] A,int left,int mid,int right){
        int i,j,k;
        int n1=mid-left;
        int n2=right-mid;
        int[] L=new int[n1+1];
        int[] R=new int[n2+1];
          
        for(i=0;i<n1;i++){
            L[i]=A[left+i];
        }
        for(i=0;i<n2;i++){
            R[i]=A[mid+i];
        }
        L[n1]=Integer.MAX_VALUE;
        R[n2]=Integer.MAX_VALUE;
        i=0;
        j=0;
           
        for(k=left;k<right;k++){
            if(L[i]<=R[j]){
                A[k]=L[i++];
            }
            else{
                A[k]=R[j++];
            }
            count++;
        }  
    }
   
    public static void margesort(int[] A,int left,int right){
        if(left+1 < right){
            int mid=(left+right)/2;
            margesort(A,left,mid);
            margesort(A,mid,right);
            sort(A,left,mid,right);
        }
    }
   
    public static void main(String[] args) throws IOException{
        int[] A;
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        A=new int[a];
        for(int i=0;i<a;i++){
            A[i]=scan.nextInt();
        }

        margesort(A,0,a);
           
        for(int i=0;i<a;i++){
            if(i<a-1) System.out.print(A[i]+" ");
            else System.out.println(A[i]);
        }
        System.out.println(count);
    }   
}