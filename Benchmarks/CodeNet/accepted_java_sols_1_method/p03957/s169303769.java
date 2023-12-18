import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean flag = false;
        if(s.indexOf("C")>=0&&s.indexOf("C")<s.lastIndexOf("F")){
            flag = true;
        }
        if(flag){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

 }