import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=1,b=1;
        while(true){
            a=sc.nextInt();
            b=sc.nextInt();
            if(a==0) break;
            for(int i=1;i<=a;i++){
                for(int j=1;j<=b;j++){
                  	if((i+j)%2==0){
                    	System.out.print("#");
                    }else if((i+j)%2==1){
                     	System.out.print(".");
                    }
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
