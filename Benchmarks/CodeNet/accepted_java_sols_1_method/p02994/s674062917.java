import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int l = s.nextInt();
        int flag=-1;
        int sum=0;
        int j=l;
        for (int i=0;i<n;i++){
            if(j==0){
                flag=1;
            }
            sum+=j;
            j++;
        }
        if(flag==1){
            System.out.println(sum);
        }else{
            if(l<0){
                System.out.println(sum-(l+n-1));
            }else{
                System.out.println(sum-l);
            }
        }
    }
}
