import java.util.Scanner;
 
public class Main {    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int[] a  = new int[n];
        for(int i=0;i<n;i++){
            a[i] = Integer.parseInt(sc.next());
        }
        for(int i=k;i<n;i++){
            if(a[i-k]<a[i]){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}