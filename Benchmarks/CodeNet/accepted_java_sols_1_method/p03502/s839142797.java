import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int fx=0;
        
        for(int i=1;i<=9;i++){
            fx+=x/Math.pow(10,i-1)%10;
        }
        
        if(x%fx==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}