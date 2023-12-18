import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int F[][]=new int[2][2];
        for(int i=0;i<2;i++){
        	for(int j=0;j<2;j++)F[i][j]=in.nextInt();
        }
        
        int a=in.nextInt(),b=in.nextInt(),c=in.nextInt(),d=in.nextInt();
        
        int hiro=(a*F[0][0])+(b*F[0][1])+(F[0][0]/10*c)+(F[0][1]/20*d);
        int ken=(a*F[1][0])+(b*F[1][1])+(F[1][0]/10*c)+(F[1][1]/20*d);
        
        String res;
        if(hiro>ken)res="hiroshi";
        else if(ken>hiro)res="kenjiro";
        else res="even";
        
        System.out.println(res);
    }
}
