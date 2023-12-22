import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean can=true;

        while(can){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int num=0;
            if((n==0)&&(x==0))can=false;
            else{
            for(int i=1;i<=n;i++){
                for(int j=i+1;j<=n;j++){
                    for(int k=j+1;k<=n;k++){
                       if(x==i+j+k)num++;
                    }
                }
            }
            System.out.println(num);
        }
        }
    }
}
