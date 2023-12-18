import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int max=-1000000000,res;
        int n=sc.nextInt();
        int num[]=new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i-1;j>=0;j--){
                res=num[i]-num[j];
                if(res>max){
                    max=res;
                }
            }
        }
        System.out.println(max);
    }
}
