import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args){
        while(sc.hasNext()){
            run();
        }
    }
    static void run(){
        String[] strA=sc.nextLine().split(" ");
        String[] strB=sc.nextLine().split(" ");
        int[] A=new int[4];
        int[] B=new int[4];
        int Hit=0;
        int Buroo=0;
        for(int i=0;i<4;i++){
            A[i]=Integer.parseInt(strA[i]);
            B[i]=Integer.parseInt(strB[i]);
            if(A[i]==B[i]){
                Hit++;
            }
        }
        Buroo-=Hit;
        for(int i=0;i<4;i++){
            if(Arrays.asList(A).contains(B[i])){
                Buroo++;
            }
        }
        System.out.println(Hit+" "+Buroo);
        
    }
}