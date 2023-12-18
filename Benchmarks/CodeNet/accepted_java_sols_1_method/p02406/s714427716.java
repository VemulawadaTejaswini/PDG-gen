import java.util.Scanner; 
public class Main { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        for (int i = 3; i <= n; i++) { 
            int a = i;
            if (i % 3 == 0) { 
            System.out.print(" " + i); 
            continue; 
            } else { 
                while (a != 0) { 
                    if (a % 10 == 3) { 
                    System.out.print(" " + i); 
                    break; 
                    } 
                a = a / 10; 
                }
            } 
        } 
    System.out.println(""); 
    } 
}
