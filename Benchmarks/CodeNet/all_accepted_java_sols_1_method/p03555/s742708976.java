import java.util.*;
public class Main{
    public static void main(String[]args){  
    Scanner sc=new Scanner(System.in);
    char[][]C=new char[2][3];
    String N=sc.next();
    String X=sc.next();
    for(int j=0;j<3;j++){
        C[0][j]=N.charAt(j);
        C[1][j]=X.charAt(j);
    }
    char[][]D=new char[2][3];
    D[0][0]=C[1][2];
    D[0][1]=C[1][1];
    D[0][2]=C[1][0];
    D[1][0]=C[0][2];
    D[1][1]=C[0][1];
    D[1][2]=C[0][0];
    if((C[0][0]==D[0][0])&&(C[0][1]==D[0][1])&&(C[0][2]==D[0][2])){
        System.out.println("YES");
    }else{
        System.out.println("NO");
    }
    
    
    
    }
}