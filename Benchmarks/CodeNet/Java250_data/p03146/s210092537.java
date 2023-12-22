import java.util.*;
import static java.lang.Math.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[1000001];
        a[1] = sc.nextInt();
        for(int i=2; i<1000001; i++){
            if(a[i-1]%2 == 0){
                a[i] = a[i -1] / 2;
            }else{
                a[i] = 3 * a[i-1] + 1;
            }
            for(int j=1; j<i; j++){
                if(a[i] == a[j]){
                    System.out.println(i);
                    return;
                }
            }
        }
    }
}
