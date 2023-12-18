import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int max=-1000000000,res,num;
        int n=sc.nextInt();
        int min=sc.nextInt();
        for(int i=0;i<n-1;i++){
            num=sc.nextInt();
            res=num-min;
            if(res>max){
                max=res;
            }
            if(min>num){
                min=num;
            }
        }
        System.out.println(max);
    }
}
