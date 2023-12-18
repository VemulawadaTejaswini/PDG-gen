import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = 0;

        for(int i=1;i<=9;i++){
            for(int j=1;j<=9;j++){
                c = i * j;
                if(a == c){
                    System.out.println("Yes");
                    return;
                } 
            }
        }
        System.out.println("No");
    } 
}