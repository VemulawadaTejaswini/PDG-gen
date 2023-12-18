import java.util.Scanner;
  
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ans_num=0;
        int n,x;
        while ((n=sc.nextInt())!=0){
            x=sc.nextInt();
            for(int i=1;i<(double)x/3;i++){
                for(int j=i+1;j<(double)(x-i)/2;j++){
                    int k=x-i-j;
                    if(k>=1&&k<=n) ans_num++;
                }
            }
            System.out.println(ans_num);
        }
    }
}