import java.util.*;
//import java.lang.Math;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String S=sc.nextLine();
        int N=S.length();
        char C[]=S.toCharArray();
        for(int i=0;i<N;i++){
            if(Character.isUpperCase(C[i])){
                C[i]+=32;
                System.out.print(C[i]);
            }
            else if(Character.isLowerCase(C[i])){
                C[i]-=32;
                System.out.print(C[i]);
            }
            else System.out.print(C[i]);
        }
        System.out.println();
    }
}
