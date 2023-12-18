import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a[],n;
        n = sc.nextInt();
        a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++){
            int j=i;
            print(a);
            while(j>0){
                if(a[j-1]>a[j]){
                    int k = a[j-1];
                    a[j-1] = a[j];
                    a[j] = k;
                    j--;
                }else{
                    break;
                }
            }
        }
        print(a);
    }
    
    public static void print(int a[]){
        int n=a.length;
        System.out.print(a[0]);
        for(int i=1;i<n;i++){
            System.out.print(" "+a[i]);
        }
        System.out.println("");
    }
}
