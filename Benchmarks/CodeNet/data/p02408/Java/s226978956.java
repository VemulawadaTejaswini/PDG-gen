import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        //カード枚数
        int number=0;
        //入力を格納する配列
        int[] S = new int[13];
        int[] H = new int[13];
        int[] C = new int[13];
        int[] D = new int[13];
        
        Scanner scan = new Scanner(System.in);
        //枚数を格納
        number = scan.nextInt();
        
        for(int i=0;i<number;i++){
            String design = scan.next();
            int cnum = scan.nextInt();
            
            if(design.equals("S")){
                check(S,cnum);
            }
            if(design.equals("H")){
                check(H,cnum);
            }
            if(design.equals("C")){
                check(C,cnum);
            }
            if(design.equals("D")){
                check(D,cnum);
            }
            
        }
        
        for(int i=0;i<13;i++){
            if(S[i]==0){
                System.out.println("S "+(i+1));
            }
        }
        for(int i=0;i<13;i++){
            if(H[i]==0){
                System.out.println("H "+(i+1));
            }
        }
        for(int i=0;i<13;i++){
            if(C[i]==0){
                System.out.println("C "+(i+1));
            }
        }
        for(int i=0;i<13;i++){
            if(D[i]==0){
                System.out.println("D "+(i+1));
            }
        }
        
        
    }

    private static void check(int[] design, int cnum) {
        design[cnum-1]=1;
    }
}