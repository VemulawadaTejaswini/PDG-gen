import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int  x = scan.nextInt();
        int a[] = new int[x];
        int nu;
        for(int i = 0; i < x; i++){
            nu = scan.nextInt();
            a[i] = nu;
        }
        int count = 0;
        Arrays.sort(a);
        for(int i = 0; i < x - 2; i++){
            for(int j = i + 1; j < x - 1; j++){
                for(int k = j + 1; k < x ; k++){
                    if(a[i] != a[j] && a[i] != a[k] && a[j] != a[k]){

                        //System.out.println(a[i] + " " + a[j] + " " + a[k]);
                        int aa = a[i];
                        int bb = a[j];
                        int cc = a[k];
                        if(((aa + bb) > cc) && (bb + cc) > aa && (cc + aa) > bb){
                            count++;
                        }                        


                }
            }
        }
    }
    System.out.println(count);
}
}