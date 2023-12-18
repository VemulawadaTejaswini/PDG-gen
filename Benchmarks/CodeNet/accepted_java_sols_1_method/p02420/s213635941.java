import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            String str = sc.next();
            if(str.equals("-")){
                break;
            }
            int count = sc.nextInt();
            for(int i = 0; i < count; i++){
                int h = sc.nextInt();
                String temp = str.substring(0,h);
                str =str.substring(h) + temp;
            }
            System.out.println(str);
        }
    }
}
