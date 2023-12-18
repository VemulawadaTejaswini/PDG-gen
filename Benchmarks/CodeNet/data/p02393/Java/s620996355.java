import java.util.*;

public class Main {
    public static void main(String[] args){
        
        int table[] = new int[3];
        
        Scanner sc = new Scanner(System.in);
        
        table[0] = sc.nextInt();
        table[1] = sc.nextInt();
        table[2] = sc.nextInt();
        
        Arrays.sort(table);
        
        System.out.println(table[0]+" "+table[1]+" "+table[2]);
    }
}

