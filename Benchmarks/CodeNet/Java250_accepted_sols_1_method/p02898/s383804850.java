import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int height = scan.nextInt();
        int count = 0;
        int i = 0;
        for (i = 0; i < num; i++){
            int heightI = scan.nextInt();
            if(heightI >= height){
                count++;
            }
        }
        System.out.println(count);
    }
}