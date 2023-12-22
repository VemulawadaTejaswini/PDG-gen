import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String  x = scan.next();
        String a,b,c ;
        a = x.substring(0,1);
        b = x.substring(1,2);
        c = x.substring(2,3);
        if(a.equals("R") && b.equals("R") && c.equals("R")){
            System.out.println("3");
        }else if(a.equals("R") && b.equals("R") && c.equals("S")){
            System.out.println("2");
        }else if(a.equals("S") && b.equals("R") && c.equals("R")){
            System.out.println("2");
        }else if(a.equals("R") && b.equals("S") && c.equals("S")){
            System.out.println("1");
        }else if(a.equals("S") && b.equals("R") && c.equals("S")){
            System.out.println("1");
        }else if(a.equals("S") && b.equals("S") && c.equals("R")){
            System.out.println("1");
        }else if(a.equals("R") && b.equals("S") && c.equals("R")){
            System.out.println("1");
        }else if(a.equals("S") && b.equals("S") && c.equals("S")){
            System.out.println("0");

        }else{

        }

    }
}