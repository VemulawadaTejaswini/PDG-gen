import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        Scanner scanner =  new Scanner(System.in);
        int x,y;
        while(true){
         x = scanner.nextInt();
         y = scanner.nextInt();
         if(x==0 && y==0){
             break;
         }
        if(x>y){
            System.out.printf("%d %d\n",y,x);
        }else{
            System.out.printf("%d %d\n",x,y);
        }
        }
    }

}

