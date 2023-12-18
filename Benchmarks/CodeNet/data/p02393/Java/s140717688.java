import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.sc);
    
    int x = sc.next();
    int y = sc.next();
    int z = sc.next();
    
    int[] sort = new int[]{x, y, z};
    
    Arrays.sort(sort);
    
    for (int i = 0; i < sort.length; i++) {
         System.out.println(sort[i]);
    }
}