import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        
        int count = 0;
        
        int n = scan.nextInt();

        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
        }
        
        int m = scan.nextInt();
        
        int[] b = new int[m];
        for(int i = 0; i < m; i++){
            b[i] = scan.nextInt();
            int indexR = n - 1;
            int indexL = 0;
            while(true){
                int indexM = (indexR + indexL) /2;
                if(b[i] == a[indexM]){
                    count++;
                    break;
                } else if(indexL > indexR){
                    break;
                } else if(b[i] > a[indexM]){
                    indexL = indexM + 1;
                } else {
                    indexR = indexM - 1;
                }
            }
        }
        
        System.out.println(count);
        
        scan.close();
    }
}

