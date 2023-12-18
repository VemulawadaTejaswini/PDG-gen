
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=1;i<=n;i++){
            if(i%3==0||i%10==3){
                System.out.print(" "+i);
            }else{
                int x=i;
                while(x>=10){
                    x/=10;
                    if(x%10==3){
                        System.out.print(" "+i);
                        break;
                    }
                }
            }
        }
        System.out.println();
    }

}

