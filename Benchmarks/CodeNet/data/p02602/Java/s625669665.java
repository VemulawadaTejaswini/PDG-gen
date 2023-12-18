import java.util.*;
public class max
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int k = reader.nextInt();
        int[] cek = new int[n];
        for(int i=0;i<n;i++){
            cek[i] = reader.nextInt();
        }
        for(int i=k;i<n;i++){
            if(cek[i]<=cek[i-k]){
                System.out.println("No");
            }   else{
                    System.out.println("Yes");
                }   
        }
    }
}
