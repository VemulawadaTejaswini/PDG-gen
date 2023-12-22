import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] data = new int[3];
        for (int a = 0; a < 3; a++) {
            data[a] = sc.nextInt();
        }
        Arrays.sort(data);
        System.out.println(data[0] + " " + data[1] + " " + data[2]);
    }
}
