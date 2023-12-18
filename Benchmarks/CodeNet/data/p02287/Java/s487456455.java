import java.util.*;

public class Main{
    static int n;
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n+1];
        for(int i=1; i<=n; i++)
            arr[i] = sc.nextInt();
        
        for(int i=1; i<=n; i++){
            System.out.println("node "+i+": key = "+arr[i]+", "+getParent(i)+getLeft(i)+getRight(i));
        }
    }

    static String getParent(int i){
        return (i>1)? "parent key = "+arr[i/2]+", " : "";
    }

    static String getLeft(int i){
        return (i*2<=n)? "left key = "+arr[i*2]+", " : "";
    }

    static String getRight(int i){
        return (i*2+1<=n)? "right key = "+arr[i*2+1]+", " : "";
    }
}
