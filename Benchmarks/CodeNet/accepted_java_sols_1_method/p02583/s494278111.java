
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        long l[]=new long[N];
        for (int i=0;i<N;i++)
        {l[i]=scan.nextLong();}
int p=0;
        for(int i=0;i<N;i++) {
        for(int j=0;j<=i;j++){
            for(int k=0;k<=j;k++){
                if(l[i]!=l[j]&&l[i]!=l[k]&&l[k]!=l[j]){
                    if(l[i]+l[j]>l[k]&&l[k]+l[j]>l[i]&&l[i]+l[k]>l[j]){p++;}
                }
        }}}
        System.out.println(p);
    }

}
