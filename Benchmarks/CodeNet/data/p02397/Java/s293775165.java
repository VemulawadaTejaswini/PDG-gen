import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        for(int i=1;;i++){
            int num=in.nextInt();
            if(num==0)
                break;
            System.out.println("Case "+i+": "+num);
        }
    }
}
