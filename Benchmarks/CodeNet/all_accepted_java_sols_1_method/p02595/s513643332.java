import java.util.*;

class Main
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        double d = sc.nextDouble();
        
        double[][] array = new double[n][2];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            array[i][0] = sc.nextDouble();
            array[i][1] = sc.nextDouble();
            double distance = Math.sqrt( Math.pow(array[i][0], 2) + Math.pow(array[i][1], 2) );
            
            if (distance <= d) {
                count++;
            }
        }
        
        System.out.println(count);
        
        
    }
}
        
        
        
