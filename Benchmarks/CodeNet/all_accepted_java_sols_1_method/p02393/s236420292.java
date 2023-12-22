import java.util.*;

class Main {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        int[] ar = {x,y,z};
        Arrays.sort(ar);
        System.out.println(ar[0]+" "+ar[1]+" "+ar[2]);
    }
}