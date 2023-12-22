import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
        	int a = scan.nextInt()*4+scan.nextInt()*2+scan.nextInt();
        	System.out.println((a==1||a==6)?"Open":"Close");
        }
    }
}