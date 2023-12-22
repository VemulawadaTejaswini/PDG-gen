import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int h;
        int count=0;
        for(int i = 0; i < n; i++){
            h = scanner.nextInt();
            if(k <= h){
                count++;
            }
        }
        System.out.println(count);


    }
}