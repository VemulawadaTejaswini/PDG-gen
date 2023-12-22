import java.util.*;

class Main
{
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        
        Arrays.sort(array);
        
        int money = 0;
        for (int i = 0; i < k; i++) {
            money += array[i];
        }
        
        System.out.println(money);
    }
}