import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        byte N=sc.nextByte(),A[][]=new byte[2][100];
        short res=0;
        for(byte i=0;i<2;i++){
            for(byte j=0;j<N;j++){
                A[i][j]=sc.nextByte();
            }
        }
        for(byte i=0;i<N;i++){
            short temp=0;
            for(byte j=0;j<N;j++){
                if(j<i){
                    temp+=A[0][j];
                }
                else if(i==j){
                    temp+=A[0][j]+A[1][j];
                }
                else{
                    temp+=A[1][j];
                }
            }
            res=(temp>res?temp:res);

        }
        System.out.println(res);
    }
}
