import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=1;i<=x;i++){
            int num=i;
            if(num%3==0){
                System.out.print(" "+i);
            }else{
                while(true){
                    if(num%10==3){
                        System.out.print(" "+i);
                        break;
                    }
                    num=num/10;
                    if(num<3)
                        break;
                }
            }
        }
        System.out.println();
    }
}
