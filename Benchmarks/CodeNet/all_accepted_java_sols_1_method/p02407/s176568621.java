import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=scan.nextInt();
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[a.length-1-i]);
            if(i<a.length-1){
                System.out.print(" ");
            }
        }
        System.out.println("");
        scan.close();
    }
}
