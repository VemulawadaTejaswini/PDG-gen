import java.util.Scanner;
class Main {
    public static void main (String args[]) {
        Scanner k = new Scanner (System.in);
        
        int c = k.nextInt();
        for (int x=0; x<c; x++) {
            int i = k.nextInt();
            int j = k.nextInt();
            int l = k.nextInt();
            double a = Math.pow(l, 2);
            double sum =((Math.pow(i, 2))+(Math.pow(j, 2))); 
            if (a==sum) {
                
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }
}