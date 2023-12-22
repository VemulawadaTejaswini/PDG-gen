import java.util.Scanner;

public class Main{

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String a="";
        String b="";
        a=sc.nextLine();
        b=sc.nextLine();

        if(a.equals(b.substring(0,a.length()))){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


    }

}