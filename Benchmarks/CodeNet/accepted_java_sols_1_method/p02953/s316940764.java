import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int h[] = new int[n];
        for (int i=0; i<n; i++) h[i]=sc.nextInt();

        for (int i=0; i<n-1; i++){
            if (h[i]-2>=h[i+1]){
                System.out.println("No");
                return;
            }else if (h[i]-1<=h[i+1]){
                if (i!=0 && (h[i-1]<=h[i]-1)){
                    h[i] = h[i]-1;
                }else if (i==0 && (h[i]<=h[i+1]-1)){
                    h[i] -= 1;
//                    h[i+1] = h[i+1]-1;
                }
            }
//            if (h[n-2]>h[n-1]){
//                System.out.println("No");
//                return;
//            }
        }
        for (int i=0; i<n-1; i++){
            if (h[i]>h[i+1]){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");

    }
}