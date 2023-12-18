import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x;
        x=sc.nextInt();
        int i;
        for(i=1;i<=x;i++){
            if(i%3==0){
                System.out.println(i);
            }else{
                while(i>100){
                    i=i/10;
                }
                if(i%10==3){
                    System.out.println(i);
                }
            }
        }
    }
}
