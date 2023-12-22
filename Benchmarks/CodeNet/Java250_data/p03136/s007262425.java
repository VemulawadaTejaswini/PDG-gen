import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] l = new int[n];
        for(int i=0;i<n;i++){
            l[i] = Integer.parseInt(sc.next());
        }
        sort(l, 0, n-1);
        int max = l[0];
        int sum = 0;
        for(int i=1;i<n;i++){
            sum += l[i];
        }
        if(max < sum){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    

    public static void sort(int[] d, int left, int right){
        if(left>=right){return;}
        int p = d[(left + right)/2];
        int l=left, r=right;
        int tmp;
        while(l<r){
            while(d[l]>p){l++;}
            while(d[r]<p){r--;}
            if(l<=r){
                tmp=d[l];
                d[l]=d[r];
                d[r]=tmp;
                l++;r--;
            }
        }
        sort(d, left, r);
        sort(d, l, right);
    }
}