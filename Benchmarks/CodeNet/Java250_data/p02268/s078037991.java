import java.util.Scanner;
public class Main {
    public static int n;
    public static int S[];
    public static int q;
    public static int T[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        S=new int[n];
        for(int i=0;i<n;i++) S[i]=sc.nextInt();
        q=sc.nextInt();
        T=new int[q];
        for(int i=0;i<q;i++) T[i]=sc.nextInt();
        int count=0;
        for(int i=0;i<q;i++){
            if(binary_search(T[i])){
            count++;
            }
        }
        System.out.println (count);
        sc.close();
    }
    private static boolean binary_search(int key){
        int left=0;
        int right=n-1;
        while(right>=left){
            int mid=(left+right)/2;
            if(S[mid]==key) return true;
            else if (S[mid] > key) right = mid - 1;
            else if (S[mid] < key) left = mid + 1;
        }
        return false;
    }
}
