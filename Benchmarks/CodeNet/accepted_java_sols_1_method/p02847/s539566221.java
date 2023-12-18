import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        String hoge = sc.next();
        if(hoge.equals("SAT")){
            System.out.println(1);
        }else if(hoge.equals("SUN")){
            System.out.println(7);
        }else if(hoge.equals("MON")){
            System.out.println(6);
        }else if(hoge.equals("TUE")){
            System.out.println(5);
        }else if(hoge.equals("WED")){
            System.out.println(4);
        }else if(hoge.equals("THU")){
            System.out.println(3);
        }else if(hoge.equals("FRI")){
            System.out.println(2);
        }
    }     
}