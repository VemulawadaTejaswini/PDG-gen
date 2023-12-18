import java.util.Scanner;
class Main{
    public void yatary() {
        Scanner sc = new Scanner(System.in);
        int x;
        x = sc.nextInt();
        int y = x *x *x;
     System.out.println(y);   
    }
    public static void main(String[] args){
    new Main().yatary();
    }
}