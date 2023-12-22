import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(), l=sc.nextInt();
        int i,tmp,flag;
        int[] array = new int[11], check = new int[11];
        for(i=0;i<9;i++) check[i]=0;
        for(i=0;i<l;i++){
            array[i] = sc.nextInt();
            check[array[i]]=1;
        }
        for(i=n;;i++){
            tmp = i;
            flag = 1;
            for(;;){
                if(tmp==0) break;
                if(check[tmp%10]==1){
                    flag = 0;
                    break;
                }
                tmp/=10;
            }
            if(flag==1){
                System.out.println(i);
                break;
            }
        }
    }
}