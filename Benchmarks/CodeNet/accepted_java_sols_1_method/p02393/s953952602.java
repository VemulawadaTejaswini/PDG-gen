import java.util.Scanner;
import java.util.Arrays;

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String temp[] = str.split(" ",0);
        int num[] = new int[temp.length];
        
        for(int index = 0;index < temp.length;index++){
            num [index] = Integer.parseInt(temp[index]);
        }
        
        Arrays.sort(num);
        
        System.out.println(num[0] + " " + num[1] + " " + num[2]);
    }
}
