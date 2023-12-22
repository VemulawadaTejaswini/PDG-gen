import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            while(true){
                int n = sc.nextInt();
                int r = sc.nextInt();
                if(n==0 && r==0){break;}
                int[] oldCards = new int[n];
                int[] newCards = new int[n];
                for(int i=0; i<oldCards.length; i++){
                    oldCards[i] = i+1;
                }
                for(int j=0; j<oldCards.length; j++){
                    newCards[j] = oldCards[j];
                }
                for(int i=0; i<r; i++){
                    int p = sc.nextInt();
                    int c = sc.nextInt();
                    for(int j=0; j<p-1; j++){
                        newCards[n-c-j-1]=oldCards[n-1-j];
                    }
                    for(int j=0; j<c; j++){
                        newCards[n-1-j]=oldCards[n-j-p];
                    }
                    for(int j=0; j<oldCards.length; j++){
                        oldCards[j] = newCards[j];
                    }
                }
                    System.out.println(newCards[n-1]);
            }
            
        }
    }
}
