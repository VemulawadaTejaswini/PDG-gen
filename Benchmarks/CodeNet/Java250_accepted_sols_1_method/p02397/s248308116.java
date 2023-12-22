import java.util.Scanner;

class Main{
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){

            int x = sc.nextInt();
            int y = sc.nextInt();

            if(x == 0 && y == 0){
                break;
            }
            if(x < y){
                System.out.println(x + " " + y);
            }else {
                System.out.println(y + " " + x);
            }
        }

    }
}