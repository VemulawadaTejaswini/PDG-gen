import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count=1;
        while(true){
            int num = sc.nextInt();
            if(num == 0)
            break;
            else
            System.out.println("Case "+count++ +": "+num);
        }
    }
}
