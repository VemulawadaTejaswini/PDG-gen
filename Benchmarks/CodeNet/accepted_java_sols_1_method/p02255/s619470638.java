import java.util.Scanner;
    
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String str = scanner.nextLine();
        String strArr[] = str.split(" ");
        
        for(int i=0;i<=n-1;i++){
            int v = Integer.parseInt(strArr[i]);
            int j = i - 1;
            while(j >= 0 && Integer.parseInt(strArr[j]) > v){
                strArr[j+1] = strArr[j];
                j--;
            }
            strArr[j+1] = String.valueOf(v);
            System.out.print(strArr[0]);
            for(int k = 1; k < n ;k++){
                System.out.print(" "+strArr[k]);
            }
            System.out.println("");
        }
    }
}
