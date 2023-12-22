import java.util.*;
//かのじょほしいぞ
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] k=new int[n];
        for(int i=0;i<n;i++){
            k[i]=sc.nextInt();
        }
        Arrays.sort(k);
        for(int i=0;i<n-1;i++){
            System.out.print(k[i]+" ");
        }
        System.out.println(k[n-1]);
    }
}