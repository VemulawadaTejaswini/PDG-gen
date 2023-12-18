import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cnt = 0;
        while(num != 0){
            if(num%10 == 1){cnt++ ;}
            num = num/10;
        }
        System.out.println(cnt+"\n");
    }
}