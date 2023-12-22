import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int count = 0;
        for(int i = x; i <= y; i++){
            if(z%i == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}