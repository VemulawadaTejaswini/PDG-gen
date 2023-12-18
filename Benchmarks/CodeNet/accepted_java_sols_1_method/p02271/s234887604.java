import java.util.HashSet;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        int[] give = new int [n];
        for(i=0;i<n;i++){
            give[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int j;
        int[] num = new int [m];
        for(j=0;j<m;j++){
            num[j] = sc.nextInt();
        }
        int k,l,o;
        HashSet<Integer> hs = new HashSet<>();
        for(k=0;k<Math.pow(2,n);k++){
            int sum = 0;
            for(l=0;l<n;l++){
                if((1&k>>l)==1){
                    sum += give[l];
                }
            }
            hs.add(sum);
        }
        for(o=0;o<m;o++){
            if(hs.contains(num[o])){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}

