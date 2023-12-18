import java.util.Scanner;
class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String b = sc.nextLine();
    String s = sc.nextLine();
    int a = Integer.parseInt(b);
    if (a >= 3200){
        System.out.println(s);
    }
    else{
        System.out.println("red");
    }
    }
}