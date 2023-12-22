import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;

        for(int i=a; i<=b; i++){
            char[] array = String.valueOf(i).toCharArray();
            int count = 0;
            for(int j=0; j<array.length - 2; j++){
                int tail = array.length -1 - j;
                if(array[j] == array[tail]){
                    count++;
                }
            }
            if(count == 3){
                sum++;
            }
        }

        System.out.println(sum);
    }
}
