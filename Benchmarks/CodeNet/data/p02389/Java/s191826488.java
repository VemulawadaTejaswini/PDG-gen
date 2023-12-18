import java.util.Scanner;
class Main{
    int x,y,men,seki;  
    public void yatary() {
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        men = x + x + y + y;
        seki = x * y;
        System.out.println(seki + " " + men);   
    }
    public static void main(String[] args){
    new Main().yatary();
    }
}