import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);
        
        int n=stdIn.nextInt();
        int []x=new int[n-1];
        int []y=new int[n];

        for(int i=0; i<x.length; i++){
            x[i]=stdIn.nextInt();
        }
        for(int i=0; i<y.length; i++){
            y[i]=0;
        }
        
        System.out.println();
        
        for(int i=0; i<n-1; i++){
            y[x[i]-1]++;
        }

        for(int i=0; i<y.length; i++){
            System.out.println(y[i]);
            
        }
    }

}