import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        hour = n/3600;
        min = (n%  3600)/60;
        n = n%60;

         System.out.println(hour+":"+min+":"+n);
        
            }
}

