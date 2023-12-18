package tinhlapphuong;
 
import java.util.Scanner;
 
/**
 *
 * @author Klaus
 */
public class TinhLapPhuong {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        lapPhuong(n);
    }
    public static void lapPhuong(int n ){
        int ketQua = n * n * n;
        System.out.println("Lap phuong cua n la : " +ketQua);
    }
    
}

