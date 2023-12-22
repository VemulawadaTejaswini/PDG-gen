import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int t[] = new int[n];
        
        int  i = 0;
        while(i<n){
            t[i] = scanner.nextInt();
            i++;
        }
        
        i =  n-1;
        while(i > 0){
            System.out.print(t[i] + " ");
            i = i -1;
        }
        System.out.print(t[0]); 

        System.out.println("");
    }
}

