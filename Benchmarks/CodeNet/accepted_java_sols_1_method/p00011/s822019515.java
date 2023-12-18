import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        try (Scanner sc = new Scanner(System.in)){
            int w = sc.nextInt();
            int n = sc.nextInt();
            int arr[] = new int[w];
            for (int i=0;i<w;i++){
                arr[i] = i+1;
            }
            for (int i=0;i<n;i++){
                String str=sc.next();
                String[] ab=str.split(",");
                int a = Integer.parseInt(ab[0]);
                int b = Integer.parseInt(ab[1]);
                int tmp;
                tmp = arr[a-1];
                arr[a-1] = arr[b-1];
                arr[b-1] = tmp;
            }
            for (int i=0;i<w;i++){
                System.out.println(arr[i]);
            }
        }
    }
}
