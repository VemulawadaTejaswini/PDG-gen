import java.util.Scanner;

class Main{
    public static void main(String[] args){
        int value = 100000;
        int n = new Scanner(System.in).nextInt();
        for(int i = 0;i < n;i++){
            value *= 1.05;
            if(value % 1000 != 0) value = value / 1000 * 1000 + 1000;
        }
        System.out.println(value);
    }
}