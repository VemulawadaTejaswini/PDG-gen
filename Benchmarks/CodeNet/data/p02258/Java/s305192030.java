import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int z = sc.nextInt();
        int[] r = new int[z];
        for(int i = 0; i < z; i++){
            r[i] = sc.nextInt();
        }
        int min = r[0];
        int max = r[1] - min;
        for(int i = 1; i < r.length; i++){
            if(max < r[i] - min){
            max =  r[i] - min;
            }
            if(min > r[i])
            min = r[i];
        }
        System.out.println(max);
    }
}