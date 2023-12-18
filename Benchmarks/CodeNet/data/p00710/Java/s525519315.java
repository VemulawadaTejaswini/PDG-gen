import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            while(true){
                int n = sc.nextInt();
                int r = sc.nextInt();
                if(n==0 && r==0) break;
                int[] values = new int[n];
                for(int i=0;i<values.length;i++){
                    values[i]=n-i;
                }
                for(int i=0;i<r;i++){
                    int p = sc.nextInt();
                    int c = sc.nextInt();
                    int[] temporary = new int[p+c-1];
                    for(int j=0;j<c;j++){
                        temporary[j]=values[p-1+j];
                    }
                    for(int j=0;j<p-1;j++){
                        temporary[c+j]=values[j];
                    }
                    for(int j=0;j<temporary.length;j++){
                        values[j]=temporary[j];
                    }
                }
                System.out.println(values[0]);
            }
        }
    }
}
