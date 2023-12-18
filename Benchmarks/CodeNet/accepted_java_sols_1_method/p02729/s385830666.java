import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int count = 0;
        for(int i = 0; i < n -1; i++){
            for(int j = i + 1; j < n; j++){
                count++;
            }
        }
        for(int i = 0; i < m -1; i++){
            for(int j = i + 1; j < m; j++){
                count++;
            }
        }
        System.out.println(count);
        

    }
    
}