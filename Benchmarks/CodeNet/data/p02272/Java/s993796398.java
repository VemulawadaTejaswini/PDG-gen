import java.util.*;
public class Main{
    static int count = 0;
    public static void Merge(long s[], int left, int mid, int right){
        int n1 = mid- left;
        int n2 = right - mid;
        long L1[] = new long[n1 + 1];
        long L2[] = new long[n2 + 1];
        for(int i = 0 ; i < n1 ; i++)
            L1[i] = s[left+i];
        for(int i = 0 ; i < n2 ; i++)
            L2[i] = s[mid+i];
        L1[n1] = L2[n2] = 1000000001;
        int i = 0;
        int j = 0;
        for(int k = left ; k < right ; k++){
            count++;
            if(L1[i] <= L2[j]){
                s[k] = L1[i];
                i++;
            }
            else{
                s[k] = L2[j];
                j++;
            }
        }
    }
    public static void MergeSort(long s[], int left, int right){
        if(left+1 < right){
            int mid = (left + right)/2;
            MergeSort(s,left,mid);
            MergeSort(s,mid,right);
            Merge(s,left,mid,right);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long s[] = new long[n];
        for(int i = 0 ; i < n ; i++)
            s[i] = sc.nextLong();
        MergeSort(s,0,n);
        for(int i = 0 ; i < n-1 ; i++)
            System.out.print(s[i] + " ");
        System.out.println(s[n-1]);
        System.out.println(count);
    }
}
