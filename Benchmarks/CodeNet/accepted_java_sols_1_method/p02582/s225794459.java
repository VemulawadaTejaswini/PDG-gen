import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int count = -1;

        if(str.matches(".*R{3}.*")){
            count = 3;
        }
        else if(str.matches(".*R{2}.*")){
            count = 2;
        }
        else if(str.matches(".*R{1}.*")){
            count = 1;
        }
        else{
            count = 0;
        }
        System.out.println(count);
    }
}