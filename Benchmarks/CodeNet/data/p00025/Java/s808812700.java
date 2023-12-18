import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[4];
        int[] b = new int[4];
        int hit = 0;
        int blow = 0;
        for(int i=0;i<4;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<4;i++){
            b[i] = sc.nextInt();
            if(b[i]==a[i]) hit++;
            else{
                for(int j=0;j<4;j++){
                    if(b[i]==a[j]) blow++;
                    else if(b[i]==a[i]) blow--;
                }
            }
        }
        System.out.println(hit + " " + blow);
    }
}
