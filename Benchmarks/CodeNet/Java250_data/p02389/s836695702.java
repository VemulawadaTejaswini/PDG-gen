import java.util.Scanner;
class Main {
    int x,y;
    public void suzuki(){
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();

        System.out.println(x * y + " " + 2 * (x + y));
    }
    public static void main(String[] args){

        new Main().suzuki();
    }

}