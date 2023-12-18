import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[2];
        while(s.hasNext()){
            for(int i=0; i < 2; i++)
                a[i] = s.nextInt();
            int gcd = 1;
            Arrays.sort(a);
            for(int j=2; j<=a[0];j++){
                if ((a[0]%j == 0) && (a[1]%j == 0))
                    gcd = j;               
            }
            int lcm =a[1];
            int k = a[1];
            boolean b = true;
            
            while(b){
                if((k%a[0]==0) && (k%a[1]==0)){
                    lcm = k;
                    b = false;
                }
                k++;
            }
            System.out.println(gcd + " " + lcm);
        }
        
    }
}