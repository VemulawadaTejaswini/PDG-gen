import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int[] b = new int[a];
        int c=0;
        int d=0;
        int ans=10000;
        for(int i=0;i<a;i++){
            b[i]=scan.nextInt();
            d+=b[i];
        }
        c=b[0];
        d-=c;
        int j=1;
        while(true){
            if(Math.abs(c-d)==0){
                ans=0;
                break;
            }
            if(ans>Math.abs(c-d)){
                ans=Math.abs(c-d);
            }
            c+=b[j];
            d-=b[j];
            j++;
            if(j==a)break;
        }
        System.out.println(ans);
    }
}