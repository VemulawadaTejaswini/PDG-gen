
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int[] l = new int[n];
        for(int i=0;i<n;i++){
            l[i] = Integer.parseInt(sc.next());
        }
        int p = 0;
        int count =0;
        for(int i=0;i<n;i++){
            if(p<=x){
                count++;
                p+=l[i];
            }else{
                break;
            }
        }
        if(p<=x){
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}